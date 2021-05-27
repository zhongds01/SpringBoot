package com.zds.springboot01.config;

import com.zds.springboot01.bean.User;
import com.zds.springboot01.bean.UserEnableConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 配置类注解，类似于配置文件，默认创建单实例对象
 */
@Configuration
@EnableConfigurationProperties(value = {UserEnableConfigurationProperties.class})
@PropertySource(value = {"classpath:user.properties"}, encoding = "UTF-8")
public class SpringConfig {

    @Bean
    public User user() {
        User user = new User();
        user.setName("SpringBoot");
        user.setAge(22);
        user.setSex("女");
        return user;
    }

    // 演示ConfigurationProperties的第二种用法
    @Bean
    @ConfigurationProperties(prefix = "user")
    public User userByConfigurationProperties() {
        return new User();
    }
}
