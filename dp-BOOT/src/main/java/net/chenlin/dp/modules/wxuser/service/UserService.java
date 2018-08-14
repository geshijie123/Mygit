package net.chenlin.dp.modules.wxuser.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.wxuser.entity.UserEntity;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public interface UserService {

    /**
     * 分页查询
     * @param params
     * @return
     */
	Page<UserEntity> listUser(Map<String, Object> params);

    /**
     * 新增
     * @param user
     * @return
     */
	R saveUser(UserEntity user);

    /**
     * 根据id查询
     * @param id
     * @return
     */
	R getUserById(Long id);

    /**
     * 修改
     * @param user
     * @return
     */
	R updateUser(UserEntity user);

    /**
     * 删除
     * @param id
     * @return
     */
	R batchRemove(Long[] id);
	
}
