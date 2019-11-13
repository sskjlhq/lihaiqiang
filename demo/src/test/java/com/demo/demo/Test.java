package com.demo.demo;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author 李海强
 * @description 测试类
 * @date 2019/10/10 16:45
 */
public class Test {
    public static void main(String[] args) {
        try {
            // 1.使用类加载器加载类
            Class c = Class.forName("com.demo.demo.DefineImpl");
            // 2.找到类上面使用的注解
            boolean isExist = c.isAnnotationPresent(DefineAnnotation.class);
            if (isExist) {
                // 3.拿到注解实例
                DefineAnnotation annotation = (DefineAnnotation) c.getAnnotation(DefineAnnotation.class);
                System.out.println(annotation.name());
                System.out.println(Arrays.toString(annotation.value()));
            }

            // 4.找到方法上的注解
            Method[] method = c.getMethods();
            for (Method m : method) {
                boolean b = m.isAnnotationPresent(DefineAnnotation.class);
                if (b) {
                    DefineAnnotation annotation = (DefineAnnotation) m.getAnnotation(DefineAnnotation.class);
                    System.out.println(annotation.name());
                    System.out.println(Arrays.toString(annotation.value()));
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
