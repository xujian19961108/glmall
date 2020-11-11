package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xujian
 * @email xj634192923@sina.com
 * @date 2020-11-06 14:21:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
