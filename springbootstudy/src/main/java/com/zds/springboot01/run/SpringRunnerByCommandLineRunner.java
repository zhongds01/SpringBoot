package com.zds.springboot01.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 通过实现CommandLineRunner接口完成自定义启动类
 */
@Component
public class SpringRunnerByCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("run by implements CommandLineRunner interface");
        System.out.println(Arrays.toString(args));
    }
}
