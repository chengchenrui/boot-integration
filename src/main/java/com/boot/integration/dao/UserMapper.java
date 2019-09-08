package com.boot.integration.dao;

import com.boot.integration.model.User;

/**
 * @author chengchenrui
 * @version Id: UserDao.java, v 0.1 2019-09-05 21:48 chengchenrui Exp $$
 */
public interface UserMapper {

    /**
     * 根据登陆号查询
     *
     * @param user
     * @return
     */
    User findByLoginName(User user);

}
