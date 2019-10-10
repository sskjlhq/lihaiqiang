package com.demo.demo.controller;/**
 * @description
 * @author 李海强
 * @date ${date} ${time}
 */

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author 李海强
 * @description 登录controller
 * @date 2019/10/9 9:40
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String, Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            // 登录成功
            session.setAttribute("loginUser", username);
            return "main";
        } else {
            // 登录失败
            map.put("msg", "登录失败！");
            return "index";
        }
    }
}
