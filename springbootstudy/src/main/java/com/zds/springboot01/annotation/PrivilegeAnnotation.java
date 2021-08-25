package com.zds.springboot01.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义权限普通注解，可通过反射获取注解值
 * Target指定注解使用的位置
 * Retention指定注解的有效周期，一般自定义注解为RUNTIME，即一直有效
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrivilegeAnnotation {
    String value() default "";

    String[] privileges() default {};
}
