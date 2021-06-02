package com.zds.springboot01;

import com.zds.springboot01.bean.User;
import com.zds.springboot01.bean.UserEnableConfigurationProperties;
import com.zds.springboot01.config.SpringConfig;
import com.zds.springboot01.config.SpringConfig01;
import com.zds.springboot01.service.TreeService  ;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

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

        // 获取TreeService实例
        TreeService treeService = applicationContext.getBean("treeService", TreeService.class);
        treeService.getTreeProperties();

        // 验证user.properties中的配置在@Bean与@ConfigurationProperties注解中的应用 -->User{name='zhongdongsheng', age=1, sex='女'}
        // 以上的name不是配置文件中的name，可以通过修改文件的prefix实现正确的name属性绑定
        User userByConfigurationProperties = applicationContext.getBean("userByConfigurationProperties", User.class);
        System.out.println(userByConfigurationProperties);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(UserEnableConfigurationProperties.class);
        Arrays.asList(beanNamesForType).forEach(System.out::println);
        // 验证@EnableConfigurationProperties与@ConfigurationProperties结合使用。不仅仅会将配置文件中属性绑定到类属性上，还会自动注入bean到容器中。bean的默认名称有点奇怪
        UserEnableConfigurationProperties userEnableConfigurationProperties = applicationContext.getBean("third.user-com.zds.springboot01.bean.UserEnableConfigurationProperties", UserEnableConfigurationProperties.class);
        System.out.println(userEnableConfigurationProperties);

        String[] beanNamesForType1 = applicationContext.getBeanNamesForType(User.class);

        for (String s : beanNamesForType1) {
            System.out.println(s);
        }


    }

}
