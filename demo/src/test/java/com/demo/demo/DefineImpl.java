package com.demo.demo;

/**
 * @author 李海强
 * @description 使用注解
 * @date 2019/11/7 9:07
 */
@DefineAnnotation(name = "我是类注解", value = {"26"})
public class DefineImpl {

    @DefineAnnotation(name = "我是方法注解", value = {"27"})
    public String test() {
        return "red";
    }
}
