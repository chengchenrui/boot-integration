package com.boot.integration.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
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

    @Bean
    @ConfigurationProperties("spring.datasource.druid")
    public DataSource dataSourceOne() {
        return DruidDataSourceBuilder.create().build();
    }

   /* @Autowired
    private UserDao userDao;

    @PostConstruct
    public void init() {
        for (int i = 1; i <= 100; i++) {
            userDao.save(new User("TEST-NAME-" + i, i + 10));
        }
    }*/
}
