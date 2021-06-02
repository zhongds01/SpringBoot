package com.zds.springboot01.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 通过实现CommandLineRunner接口完成自定义启动类
 * 直接将自定义的启动参数传递到args数组中，参数之间使用空格分割
 */
@Component
@Order(1)
public class SpringRunnerByCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("run by implements CommandLineRunner interface");
        System.out.println(Arrays.toString(args));
    }
}
