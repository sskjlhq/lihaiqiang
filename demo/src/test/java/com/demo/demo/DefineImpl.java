package com.demo.demo;

import org.springframework.web.method.HandlerMethod;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/**
 * @author 李海强
 * @description 注解实现类，通过java反射机制来获取注解对象
 * @date 2019/11/7 9:07
 */
public class DefineImpl {
    public boolean preHandle(Class<?> clazz) {
        // 注解作用在方法上
        Method[] methods = clazz.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(DefineAnnotation.class)) {
                DefineAnnotation annoExample = method.getAnnotation(DefineAnnotation.class);
                //获取到注解参数的值后就可以做你想做的了
                System.out.println("注解生效");
                return true;
            }
        }
        return false;
    }
}
