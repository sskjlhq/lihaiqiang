package com.demo.demo.interceptor;/**
 * @description
 * @author 李海强
 * @date ${date} ${time}
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 李海强
 * @description 登录拦截器
 * @date 2019/10/9 11:03
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    // 目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object user = httpServletRequest.getSession().getAttribute("loginUser");

        log.info("================================进入当前登录拦截方法====================================");

        if (user == null) {
            // 未登录，返回登录页面
            httpServletRequest.setAttribute("msg", "没有权限，请先登录！");
            httpServletRequest.getRequestDispatcher("/").forward(httpServletRequest, httpServletResponse);
            return false;
        } else {
            // 已登录，放行请求
            httpServletRequest.getRequestDispatcher("/main.html").forward(httpServletRequest, httpServletResponse);
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
