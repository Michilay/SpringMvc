package com.michilay.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Michilay");
        modelAndView.addObject("csdn","https://blog.csdn.net/Michilay");
        modelAndView.addObject("github","https://github.com/Michilay");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
