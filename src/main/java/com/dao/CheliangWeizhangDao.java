package com.dao;

import com.entity.CheliangWeizhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangWeizhangView;

/**
 * 车辆违章 Dao 接口
 *
 * @author 
 */
public interface CheliangWeizhangDao extends BaseMapper<CheliangWeizhangEntity> {

   List<CheliangWeizhangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
