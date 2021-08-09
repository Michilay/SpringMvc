package com.michilay.controller;

import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EncodingController {

    @SneakyThrows
    @RequestMapping("/e1")
    public String test1(String name, Model model, HttpServletRequest request){
        request.setCharacterEncoding("utf-8");
        model.addAttribute("msg",name);
        return "/user";
    }
}
