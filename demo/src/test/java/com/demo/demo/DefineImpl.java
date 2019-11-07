package com.demo.demo;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author 李海强
 * @description 注解实现类，通过java反射机制来获取注解对象
 * @date 2019/11/7 9:07
 */
@DefineAnnotation(name = "我是类注解", value = {"26"})
public class DefineImpl {

    @DefineAnnotation(name = "我是方法注解", value = {"27"})
    public String test() {
        return "red";
    }
}
