package com.michilay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//自动装配
@Controller
public class HelloController{
    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello spring mvcAnnotation");
        return "hello"; //被视图解析器处理
    }

}
