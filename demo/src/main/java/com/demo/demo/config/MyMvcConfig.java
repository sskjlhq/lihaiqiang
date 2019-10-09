package com.demo.demo.config;/**
 * @description
 * @author 李海强
 * @date ${date} ${time}
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 李海强
 * @description springmvc配置类
 * 使用WebMvcConfigurerAdapter可以来扩展SpringMvc的功能
 * @date 2019/10/9 12:04
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        registry.addViewController("/").setViewName("main");
    }
}
