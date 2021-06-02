package com.zds.springboot01.run;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 实现ApplicationRunner接口表示该类为启动类
 */
@Component
public class SpringRunnerByApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("run by implements ApplicationRunner interface ...");
        System.out.println(Arrays.toString(args.getSourceArgs()));
    }
}
