package com.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @param
 * @author
 * @description test_controller
 * @date
 * @return
 */
@Controller
@RequestMapping("/")
public class controller {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world!";
    }
}
