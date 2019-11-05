package com.demo.demo.config;/**
 * @description
 * @author 李海强
 * @date ${date} ${time}
 */

import com.demo.demo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
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
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //配置静态资源处理
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/**", "classpath:/public/**",
                        "classpath:/templates/**");
    }

    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                // 拦截所有请求
                .addPathPatterns("/**")
                // 不拦截的请求
                // 静态资源不用专门处理，如css、js
                .excludePathPatterns("/", "/login", "/user/login");
    }
}
