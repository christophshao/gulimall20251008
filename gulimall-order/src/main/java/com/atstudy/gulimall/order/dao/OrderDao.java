package com.atstudy.gulimall.order.dao;

import com.atstudy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sjf
 * @email 1921719677@qq.com
 * @date 2025-10-18 13:57:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
