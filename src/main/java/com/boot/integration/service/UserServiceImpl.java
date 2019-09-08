package com.boot.integration.service;

import com.boot.integration.dao.UserMapper;
import com.boot.integration.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chengchenrui
 * @version Id: UserServiceImpl.java, v 0.1 2019-09-05 21:53 chengchenrui Exp $$
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    /**
     * query
     *
     * @param user
     * @return
     */
    @Override
    public User findByLoginName(User user) {
        return userDao.findByLoginName(user);
    }
}
