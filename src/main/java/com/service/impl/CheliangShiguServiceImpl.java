package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.CheliangShiguDao;
import com.entity.CheliangShiguEntity;
import com.service.CheliangShiguService;
import com.entity.view.CheliangShiguView;

/**
 * 车辆事故 服务实现类
 */
@Service("cheliangShiguService")
@Transactional
public class CheliangShiguServiceImpl extends ServiceImpl<CheliangShiguDao, CheliangShiguEntity> implements CheliangShiguService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<CheliangShiguView> page =new Query<CheliangShiguView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
