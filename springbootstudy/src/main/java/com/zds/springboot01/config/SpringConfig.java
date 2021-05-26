package com.zds.springboot01.config;

import com.zds.springboot01.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类注解，类似于配置文件，默认创建单实例对象
 */
@Configuration
public class SpringConfig {

    @Bean
    public User user() {
        User user = new User();
        user.setName("SpringBoot");
        user.setAge(22);
        user.setSex("女");
        return user;
    }
}
