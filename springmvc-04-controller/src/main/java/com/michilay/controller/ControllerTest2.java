package com.michilay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {

    @RequestMapping("/t1")
    public String test1(Model model){
        model.addAttribute("msg","a'd'fa'd's");
        return "test";
    }

}
