package com.demo.demo;/**
 * @description
 * @author 李海强
 * @date ${date} ${time}
 */

import java.util.List;

/**
 * @author 李海强
 * @description 测试类
 * @date 2019/10/10 16:45
 */
public class Test {

    public static void main(String[] args) {
        Gril p1 = new Gril();

        System.out.println(p1 instanceof List);//false
        System.out.println(p1 instanceof List<?>);//false
        System.out.println(p1 instanceof Object);//true
        String1();
    }

    @DefineAnnotation
    private static void String1() {
        System.out.println("test~~~~");
    }
}
