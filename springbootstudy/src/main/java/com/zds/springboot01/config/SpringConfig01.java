package com.zds.springboot01.config;

import com.zds.springboot01.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 设置该配置类proxyBeanMethods为false的场景
 */
@Configuration(proxyBeanMethods = false)
@ComponentScan(value = {"com.zds.springboot01"})
public class SpringConfig01 {

    @Bean
    public User user01(){
        return new User();
    }
}
