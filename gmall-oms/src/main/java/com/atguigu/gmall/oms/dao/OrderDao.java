package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xujian
 * @email xj634192923@sina.com
 * @date 2020-11-06 14:19:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
