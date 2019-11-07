package com.demo.demo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @param
 * @author
 * @description 测试实体类
 * @date
 * @return
 */
@Data
public class Gril implements Serializable {
    // 主键id
    @Id
    @GeneratedValue(generator = "system-uuid")
    private String id;
    // 姓名
    private String name;
    // 年龄
    public String age;

    @Override
    public String toString() {
        return "Gril{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
