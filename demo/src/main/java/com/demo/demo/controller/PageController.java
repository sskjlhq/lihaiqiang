package com.demo.demo.controller;/**
 * @description
 * @author 李海强
 * @date ${date} ${time}
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

/**
 * @author 李海强
 * @description 页面跳转controller
 * @date 2019/9/29 16:04
 */
@Controller
@Slf4j
@RequestMapping("/")
public class PageController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
