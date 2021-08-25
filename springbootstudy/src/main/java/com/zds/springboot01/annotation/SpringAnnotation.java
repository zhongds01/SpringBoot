package com.zds.springboot01.annotation;

import org.springframework.core.annotation.AliasFor;

/**
 * 定义一个spring应用中使用的注解,适用于不指定注解属性时的默认属性
 * 解析的时候只能使用spring提供的注解解析方法 AnnotationUtils.getAnnotation(xx,xx);
 */
public @interface SpringAnnotation {
    @AliasFor("privilege")
    String value() default "";

    @AliasFor("value")
    String privilege() default "";

    String[] privileges() default {};
}
