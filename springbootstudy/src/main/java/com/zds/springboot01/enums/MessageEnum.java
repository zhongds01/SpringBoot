package com.zds.springboot01.enums;

/**
 * 消息返回枚举类
 */
public enum MessageEnum {
    SUCCESS_MESSAGE(0000000, "return success"),
    ERROR_MESSAGE(9999999, "return error"),
    WARN_MESSAGE(3333333, "return warn");
    /**
     * 返回码
     */
    private final Integer code;
    /**
     * 返回描述
     */
    private final String message;

    MessageEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
