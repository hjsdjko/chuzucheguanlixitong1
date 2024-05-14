package com.dao;

import com.entity.CheliangNianshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangNianshenView;

/**
 * 车辆年审 Dao 接口
 *
 * @author 
 */
public interface CheliangNianshenDao extends BaseMapper<CheliangNianshenEntity> {

   List<CheliangNianshenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
