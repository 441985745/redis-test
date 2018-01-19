package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: demo
 * @description:
 * @author: zhangshulong
 * @create: 2018-01-19 09:07
 **/
@RestController
public class TestController {

    @RequestMapping("/hello_world")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        mv.addObject("userName","程序员");
        return mv;
    }
}
