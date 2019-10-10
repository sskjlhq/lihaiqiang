package com.demo.demo.config;/**
 * @description
 * @author 李海强
 * @date ${date} ${time}
 */

import com.demo.demo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
        registry.addInterceptor(new LoginInterceptor())
                // 拦截所有请求
                .addPathPatterns("/**")
                // 不拦截的请求
                // 静态资源不用专门处理，如css、js
                .excludePathPatterns("/", "/login", "/user/login");
    }
}
