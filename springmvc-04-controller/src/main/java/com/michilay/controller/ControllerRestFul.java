package com.michilay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerRestFul {

//    原来的风格:http://localhost:8080/add?a=1&b=2原来的方式
    @RequestMapping("/add")
    public String test(int a, int b, Model model){
        int res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
//    RestFul风格:http://localhost:8080/add1/1/2
    @RequestMapping("/add1/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
    @PostMapping("/add2/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","post结果为"+res);
        return "test";
    }
    @GetMapping("/add2/{a}/{b}")
    public String test3(@PathVariable int a,@PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","get结果为"+res);
        return "test";
    }
}
