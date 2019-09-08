package com.boot.integration.model;

import lombok.Data;

/**
 * @author chengchenrui
 * @version Id: User.java, v 0.1 2019-09-05 21:46 chengchenrui Exp $$
 */
@Data
public class User {

    private Long id;

    private String name;

    private String loginName;

    private String password;
}
