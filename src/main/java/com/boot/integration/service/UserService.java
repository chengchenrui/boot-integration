package com.boot.integration.service;

import com.boot.integration.model.User;

/**
 * @author chengchenrui
 * @version Id: UserService.java, v 0.1 2019-09-05 21:52 chengchenrui Exp $$
 */
public interface UserService {

    /**
     * query
     *
     * @param user
     * @return
     */
    User findByLoginName(User user);
}
