package com.demo.demo.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @param
 * @author
 * @description 测试实体类
 * @date
 * @return
 */
@Data
public class Gril {
    @Id
    @GeneratedValue(generator = "system-uuid")
    private String id;
    private String name;
    private String age;
}