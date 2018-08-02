package net.chenlin.dp.modules.wx.dao;

import org.apache.ibatis.annotations.Mapper;

import net.chenlin.dp.modules.wx.entity.UserEntity;
import net.chenlin.dp.modules.sys.dao.BaseMapper;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
