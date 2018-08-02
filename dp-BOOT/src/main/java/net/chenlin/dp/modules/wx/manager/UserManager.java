package net.chenlin.dp.modules.wx.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.wx.entity.UserEntity;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public interface UserManager {

    /**
     * 分页查询
     * @param page
     * @param search
     * @return
     */
	List<UserEntity> listUser(Page<UserEntity> page, Query search);

    /**
     * 新增
     * @param user
     * @return
     */
	int saveUser(UserEntity user);

    /**
     * 根据id查询
     * @param id
     * @return
     */
	UserEntity getUserById(Long id);

    /**
     * 修改
     * @param user
     * @return
     */
	int updateUser(UserEntity user);

    /**
     * 删除
     * @param id
     * @return
     */
	int batchRemove(Long[] id);
	
}
