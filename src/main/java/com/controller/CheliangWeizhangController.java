
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 车辆违章
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/cheliangWeizhang")
public class CheliangWeizhangController {
    private static final Logger logger = LoggerFactory.getLogger(CheliangWeizhangController.class);

    @Autowired
    private CheliangWeizhangService cheliangWeizhangService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private CheliangService cheliangService;

    @Autowired
    private JiashiyuanService jiashiyuanService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("驾驶员".equals(role)){
            List<CheliangEntity> cheliangEntities = cheliangService.selectList(new EntityWrapper<CheliangEntity>().eq("jiashiyuan_id", request.getSession().getAttribute("userId")));
            if(cheliangEntities.size()>0){
                List<Integer> cheliangIds = new ArrayList<>();
                for(CheliangEntity c:cheliangEntities){
                    cheliangIds.add(c.getId());
                }
                params.put("cheliangIds",cheliangIds);
            }else{
                params.put("cheliangIds",null);
            }
            params.put("jiashiyuanId",request.getSession().getAttribute("userId"));
        }
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = cheliangWeizhangService.queryPage(params);

        //字典表数据转换
        List<CheliangWeizhangView> list =(List<CheliangWeizhangView>)page.getList();
        for(CheliangWeizhangView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        CheliangWeizhangEntity cheliangWeizhang = cheliangWeizhangService.selectById(id);
        if(cheliangWeizhang !=null){
            //entity转view
            CheliangWeizhangView view = new CheliangWeizhangView();
            BeanUtils.copyProperties( cheliangWeizhang , view );//把实体数据重构到view中

                //级联表
                CheliangEntity cheliang = cheliangService.selectById(cheliangWeizhang.getCheliangId());
                if(cheliang != null){
                    BeanUtils.copyProperties( cheliang , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setCheliangId(cheliang.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody CheliangWeizhangEntity cheliangWeizhang, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,cheliangWeizhang:{}",this.getClass().getName(),cheliangWeizhang.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<CheliangWeizhangEntity> queryWrapper = new EntityWrapper<CheliangWeizhangEntity>()
            .eq("cheliang_id", cheliangWeizhang.getCheliangId())
            .eq("cheliang_weizhang_uuid_number", cheliangWeizhang.getCheliangWeizhangUuidNumber())
            .eq("cheliang_weizhang_name", cheliangWeizhang.getCheliangWeizhangName())
            .eq("cheliang_weizhang_types", cheliangWeizhang.getCheliangWeizhangTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        CheliangWeizhangEntity cheliangWeizhangEntity = cheliangWeizhangService.selectOne(queryWrapper);
        if(cheliangWeizhangEntity==null){
            cheliangWeizhang.setInsertTime(new Date());
            cheliangWeizhang.setCreateTime(new Date());
            cheliangWeizhangService.insert(cheliangWeizhang);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody CheliangWeizhangEntity cheliangWeizhang, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,cheliangWeizhang:{}",this.getClass().getName(),cheliangWeizhang.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<CheliangWeizhangEntity> queryWrapper = new EntityWrapper<CheliangWeizhangEntity>()
            .notIn("id",cheliangWeizhang.getId())
            .andNew()
            .eq("cheliang_id", cheliangWeizhang.getCheliangId())
            .eq("cheliang_weizhang_uuid_number", cheliangWeizhang.getCheliangWeizhangUuidNumber())
            .eq("cheliang_weizhang_name", cheliangWeizhang.getCheliangWeizhangName())
            .eq("cheliang_weizhang_types", cheliangWeizhang.getCheliangWeizhangTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        CheliangWeizhangEntity cheliangWeizhangEntity = cheliangWeizhangService.selectOne(queryWrapper);
        if("".equals(cheliangWeizhang.getCheliangWeizhangFile()) || "null".equals(cheliangWeizhang.getCheliangWeizhangFile())){
                cheliangWeizhang.setCheliangWeizhangFile(null);
        }
        if(cheliangWeizhangEntity==null){
            cheliangWeizhangService.updateById(cheliangWeizhang);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        cheliangWeizhangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<CheliangWeizhangEntity> cheliangWeizhangList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            CheliangWeizhangEntity cheliangWeizhangEntity = new CheliangWeizhangEntity();
//                            cheliangWeizhangEntity.setCheliangId(Integer.valueOf(data.get(0)));   //车辆 要改的
//                            cheliangWeizhangEntity.setCheliangWeizhangUuidNumber(data.get(0));                    //违章编号 要改的
//                            cheliangWeizhangEntity.setCheliangWeizhangName(data.get(0));                    //违章名称 要改的
//                            cheliangWeizhangEntity.setCheliangWeizhangFile(data.get(0));                    //违章相关文件 要改的
//                            cheliangWeizhangEntity.setCheliangWeizhangContent("");//详情和图片
//                            cheliangWeizhangEntity.setCheliangWeizhangTime(sdf.parse(data.get(0)));          //发生违章时间 要改的
//                            cheliangWeizhangEntity.setCheliangWeizhangChuliTime(sdf.parse(data.get(0)));          //处理时间 要改的
//                            cheliangWeizhangEntity.setCheliangWeizhangTypes(Integer.valueOf(data.get(0)));   //车辆违章类型 要改的
//                            cheliangWeizhangEntity.setCheliangWeizhangChulijieguoContent("");//详情和图片
//                            cheliangWeizhangEntity.setInsertTime(date);//时间
//                            cheliangWeizhangEntity.setCreateTime(date);//时间
                            cheliangWeizhangList.add(cheliangWeizhangEntity);


                            //把要查询是否重复的字段放入map中
                                //违章编号
                                if(seachFields.containsKey("cheliangWeizhangUuidNumber")){
                                    List<String> cheliangWeizhangUuidNumber = seachFields.get("cheliangWeizhangUuidNumber");
                                    cheliangWeizhangUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> cheliangWeizhangUuidNumber = new ArrayList<>();
                                    cheliangWeizhangUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("cheliangWeizhangUuidNumber",cheliangWeizhangUuidNumber);
                                }
                        }

                        //查询是否重复
                         //违章编号
                        List<CheliangWeizhangEntity> cheliangWeizhangEntities_cheliangWeizhangUuidNumber = cheliangWeizhangService.selectList(new EntityWrapper<CheliangWeizhangEntity>().in("cheliang_weizhang_uuid_number", seachFields.get("cheliangWeizhangUuidNumber")));
                        if(cheliangWeizhangEntities_cheliangWeizhangUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(CheliangWeizhangEntity s:cheliangWeizhangEntities_cheliangWeizhangUuidNumber){
                                repeatFields.add(s.getCheliangWeizhangUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [违章编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        cheliangWeizhangService.insertBatch(cheliangWeizhangList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
