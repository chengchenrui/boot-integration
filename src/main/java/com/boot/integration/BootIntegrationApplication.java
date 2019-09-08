package com.boot.integration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author chengchenrui
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.boot.integration.dao"})
public class BootIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootIntegrationApplication.class, args);
    }

}
