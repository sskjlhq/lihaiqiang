package com.demo.demo;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @author 李海强
 * @description
 */
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DefineAnnotation {

    String name();

    String[] value();

    int age() default 18;
}
