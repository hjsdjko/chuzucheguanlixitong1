
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
 * 车辆维修
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/cheliangWeixiu")
public class CheliangWeixiuController {
    private static final Logger logger = LoggerFactory.getLogger(CheliangWeixiuController.class);

    @Autowired
    private CheliangWeixiuService cheliangWeixiuService;


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
        PageUtils page = cheliangWeixiuService.queryPage(params);

        //字典表数据转换
        List<CheliangWeixiuView> list =(List<CheliangWeixiuView>)page.getList();
        for(CheliangWeixiuView c:list){
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
        CheliangWeixiuEntity cheliangWeixiu = cheliangWeixiuService.selectById(id);
        if(cheliangWeixiu !=null){
            //entity转view
            CheliangWeixiuView view = new CheliangWeixiuView();
            BeanUtils.copyProperties( cheliangWeixiu , view );//把实体数据重构到view中

                //级联表
                CheliangEntity cheliang = cheliangService.selectById(cheliangWeixiu.getCheliangId());
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
    public R save(@RequestBody CheliangWeixiuEntity cheliangWeixiu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,cheliangWeixiu:{}",this.getClass().getName(),cheliangWeixiu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<CheliangWeixiuEntity> queryWrapper = new EntityWrapper<CheliangWeixiuEntity>()
            .eq("cheliang_id", cheliangWeixiu.getCheliangId())
            .eq("cheliang_weixiu_uuid_number", cheliangWeixiu.getCheliangWeixiuUuidNumber())
            .eq("cheliang_weixiu_name", cheliangWeixiu.getCheliangWeixiuName())
            .eq("cheliang_weixiu_types", cheliangWeixiu.getCheliangWeixiuTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        CheliangWeixiuEntity cheliangWeixiuEntity = cheliangWeixiuService.selectOne(queryWrapper);
        if(cheliangWeixiuEntity==null){
            cheliangWeixiu.setInsertTime(new Date());
            cheliangWeixiu.setCreateTime(new Date());
            cheliangWeixiuService.insert(cheliangWeixiu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody CheliangWeixiuEntity cheliangWeixiu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,cheliangWeixiu:{}",this.getClass().getName(),cheliangWeixiu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<CheliangWeixiuEntity> queryWrapper = new EntityWrapper<CheliangWeixiuEntity>()
            .notIn("id",cheliangWeixiu.getId())
            .andNew()
            .eq("cheliang_id", cheliangWeixiu.getCheliangId())
            .eq("cheliang_weixiu_uuid_number", cheliangWeixiu.getCheliangWeixiuUuidNumber())
            .eq("cheliang_weixiu_name", cheliangWeixiu.getCheliangWeixiuName())
            .eq("cheliang_weixiu_types", cheliangWeixiu.getCheliangWeixiuTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        CheliangWeixiuEntity cheliangWeixiuEntity = cheliangWeixiuService.selectOne(queryWrapper);
        if("".equals(cheliangWeixiu.getCheliangWeixiuFile()) || "null".equals(cheliangWeixiu.getCheliangWeixiuFile())){
                cheliangWeixiu.setCheliangWeixiuFile(null);
        }
        if(cheliangWeixiuEntity==null){
            cheliangWeixiuService.updateById(cheliangWeixiu);//根据id更新
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
        cheliangWeixiuService.deleteBatchIds(Arrays.asList(ids));
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
            List<CheliangWeixiuEntity> cheliangWeixiuList = new ArrayList<>();//上传的东西
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
                            CheliangWeixiuEntity cheliangWeixiuEntity = new CheliangWeixiuEntity();
//                            cheliangWeixiuEntity.setCheliangId(Integer.valueOf(data.get(0)));   //车辆 要改的
//                            cheliangWeixiuEntity.setCheliangWeixiuUuidNumber(data.get(0));                    //维修编号 要改的
//                            cheliangWeixiuEntity.setCheliangWeixiuName(data.get(0));                    //维修名称 要改的
//                            cheliangWeixiuEntity.setCheliangWeixiuFile(data.get(0));                    //维修文件 要改的
//                            cheliangWeixiuEntity.setCheliangWeixiuTime(sdf.parse(data.get(0)));          //维修时间 要改的
//                            cheliangWeixiuEntity.setCheliangWeixiuContent("");//详情和图片
//                            cheliangWeixiuEntity.setCheliangWeixiuTypes(Integer.valueOf(data.get(0)));   //维修结果 要改的
//                            cheliangWeixiuEntity.setInsertTime(date);//时间
//                            cheliangWeixiuEntity.setCreateTime(date);//时间
                            cheliangWeixiuList.add(cheliangWeixiuEntity);


                            //把要查询是否重复的字段放入map中
                                //维修编号
                                if(seachFields.containsKey("cheliangWeixiuUuidNumber")){
                                    List<String> cheliangWeixiuUuidNumber = seachFields.get("cheliangWeixiuUuidNumber");
                                    cheliangWeixiuUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> cheliangWeixiuUuidNumber = new ArrayList<>();
                                    cheliangWeixiuUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("cheliangWeixiuUuidNumber",cheliangWeixiuUuidNumber);
                                }
                        }

                        //查询是否重复
                         //维修编号
                        List<CheliangWeixiuEntity> cheliangWeixiuEntities_cheliangWeixiuUuidNumber = cheliangWeixiuService.selectList(new EntityWrapper<CheliangWeixiuEntity>().in("cheliang_weixiu_uuid_number", seachFields.get("cheliangWeixiuUuidNumber")));
                        if(cheliangWeixiuEntities_cheliangWeixiuUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(CheliangWeixiuEntity s:cheliangWeixiuEntities_cheliangWeixiuUuidNumber){
                                repeatFields.add(s.getCheliangWeixiuUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [维修编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        cheliangWeixiuService.insertBatch(cheliangWeixiuList);
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
