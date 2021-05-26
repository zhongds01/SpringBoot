package com.zds.springboot01;

import com.zds.springboot01.bean.User;
import com.zds.springboot01.config.SpringConfig;
import com.zds.springboot01.config.SpringConfig01;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot01Application.class, args);
        // 测试是否成功获取到通过Configuration注解注入的User实例 --> true
        System.out.println(applicationContext.containsBean("user"));
        // 测试注入的实例属性是否成功注入 --> SpringBoot
        System.out.println(applicationContext.getBean("user", User.class).getName());
        // 测试默认情况下Configuration注入的实例是否单例 --> true
        SpringConfig springConfig = applicationContext.getBean("springConfig", SpringConfig.class);
        System.out.println(springConfig.user() == springConfig.user());
        // 测试设置proxyBeanMethods情况下Configuration注入的实例是否单例 --> false
        SpringConfig01 springConfig01 = applicationContext.getBean("springConfig01", SpringConfig01.class);
        System.out.println(springConfig01.user01() == springConfig01.user01());

    }

}
