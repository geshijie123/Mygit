package net.chenlin.dp.modules.wxuser.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.wxuser.entity.UserEntity;
import net.chenlin.dp.modules.wxuser.service.UserService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@RestController
@RequestMapping("/wx/wxuser")
public class UserController extends AbstractController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<UserEntity> list(@RequestBody Map<String, Object> params) {
		return userService.listUser(params);
	}
		
	/**
	 * 新增
	 * @param user
	 * @return
	 */
	@SysLog("新增")
	@RequestMapping("/save")
	public R save(@RequestBody UserEntity user) {
		return userService.saveUser(user);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return userService.getUserById(id);
	}
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	@SysLog("修改")
	@RequestMapping("/update")
	public R update(@RequestBody UserEntity user) {
		return userService.updateUser(user);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return userService.batchRemove(id);
	}
	
}
