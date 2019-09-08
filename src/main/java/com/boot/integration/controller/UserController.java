package com.boot.integration.controller;

import com.boot.integration.model.User;
import com.boot.integration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengchenrui
 * @version Id: UserController.java, v 0.1 2019-09-05 21:52 chengchenrui Exp $$
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/loginName")
    public User list(User user) {
        return userService.findByLoginName(user);
    }
}