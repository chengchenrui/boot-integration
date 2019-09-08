package com.boot.integration;

import com.boot.integration.model.User;
import com.boot.integration.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author chengchenrui
 * @version Id: UserServiceTest.java, v 0.1 2019-09-08 10:51 chengchenrui Exp $$
 */
@Slf4j
public class UserServiceTest extends BootIntegrationApplicationTests {

    @Resource
    private UserService userService;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void userTest() {
        User user = new User();
        user.setLoginName("chengcheng");

        User userResponse = userService.findByLoginName(user);
        log.info("response : {}", userResponse);
    }

    @Test
    public void redisTest() {
        redisTemplate.opsForValue().set("cheng:key", "abc", 60, TimeUnit.SECONDS);
        String redisTestString = redisTemplate.opsForValue().get("cheng:key");
        log.info("redis value : {}", redisTestString);
    }
}
