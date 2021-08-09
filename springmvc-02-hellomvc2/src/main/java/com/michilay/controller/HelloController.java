package com.michilay.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
//        业务代码
        String helloSpringMVC = "HelloSpringMVC";
//        视图跳转
        modelAndView.addObject("msg", helloSpringMVC);
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
