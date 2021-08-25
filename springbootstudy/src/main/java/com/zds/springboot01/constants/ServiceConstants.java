package com.zds.springboot01.constants;

/**
 * 自定义业务常量类
 */
public final class ServiceConstants {
    public interface ReturnCode {
        String SUCCESS = "0000000";
        String ERROR = "9999999";
        String WARN = "3333333";
    }

    public interface Node {
        Integer NODE_1 = 1;
        Integer NODE_2 = 2;
    }
}
