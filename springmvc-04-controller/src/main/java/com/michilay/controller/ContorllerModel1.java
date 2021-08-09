package com.michilay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ContorllerModel1 {

    @RequestMapping("/m1/t1")
    public String test1(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "test";
    }
    @RequestMapping("/m1")
    public String test2(Model model){
        model.addAttribute("msg","aefeafi");
        return "redirect:index.jsp";
    }
    @RequestMapping("/m2")
    public String test3(Model model){
        model.addAttribute("msg","aefeafi");
        return "WEB-INF/jsp/test.jsp";
    }
    @RequestMapping("/m3")
    public String test4(Model model){
        model.addAttribute("msg","aefeafi");
        return "test";
    }
    @RequestMapping("/m4")
    public String test5(Model model){
        model.addAttribute("msg","aefeafi");
        return "redirect:/index.jsp";
    }
}
