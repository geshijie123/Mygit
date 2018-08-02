package net.chenlin.dp.modules.wx.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.wx.entity.UserEntity;
import net.chenlin.dp.modules.wx.manager.UserManager;
import net.chenlin.dp.modules.wx.service.UserService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserManager userManager;

    /**
     * 分页查询
     * @param params
     * @return
     */
	@Override
	public Page<UserEntity> listUser(Map<String, Object> params) {
		Query query = new Query(params);
		Page<UserEntity> page = new Page<>(query);
		userManager.listUser(page, query);
		return page;
	}

    /**
     * 新增
     * @param user
     * @return
     */
	@Override
	public R saveUser(UserEntity user) {
		int count = userManager.saveUser(user);
		return CommonUtils.msg(count);
	}

    /**
     * 根据id查询
     * @param id
     * @return
     */
	@Override
	public R getUserById(Long id) {
		UserEntity user = userManager.getUserById(id);
		return CommonUtils.msg(user);
	}

    /**
     * 修改
     * @param user
     * @return
     */
	@Override
	public R updateUser(UserEntity user) {
		int count = userManager.updateUser(user);
		return CommonUtils.msg(count);
	}

    /**
     * 删除
     * @param id
     * @return
     */
	@Override
	public R batchRemove(Long[] id) {
		int count = userManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
