package net.chenlin.dp.modules.wx.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.wx.dao.UserMapper;
import net.chenlin.dp.modules.wx.entity.UserEntity;
import net.chenlin.dp.modules.wx.manager.UserManager;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Component("userManager")
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserMapper userMapper;

    /**
     * 分页查询
     * @param page
     * @param search
     * @return
     */
	@Override
	public List<UserEntity> listUser(Page<UserEntity> page, Query search) {
		return userMapper.listForPage(page, search);
	}

    /**
     * 新增
     * @param user
     * @return
     */
	@Override
	public int saveUser(UserEntity user) {
		return userMapper.save(user);
	}

    /**
     * 根据id查询
     * @param id
     * @return
     */
	@Override
	public UserEntity getUserById(Long id) {
		UserEntity user = userMapper.getObjectById(id);
		return user;
	}

    /**
     * 修改
     * @param user
     * @return
     */
	@Override
	public int updateUser(UserEntity user) {
		return userMapper.update(user);
	}

    /**
     * 删除
     * @param id
     * @return
     */
	@Override
	public int batchRemove(Long[] id) {
		int count = userMapper.batchRemove(id);
		return count;
	}
	
}
