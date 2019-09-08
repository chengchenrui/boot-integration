package com.boot.integration.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author chengchenrui
 * @version Id: DataSourceConfigurer.java, v 0.1 2019-09-05 21:39 chengchenrui Exp $$
 */
@Configuration
public class DataSourceConfigurer {

    @Value("${spring.datasource.username}")
    public String userName;

    @Bean
    @ConfigurationProperties("spring.datasource.druid")
    public DataSource dataSourceOne() {
        System.out.println(userName);
        return DruidDataSourceBuilder.create().build();
    }
}
