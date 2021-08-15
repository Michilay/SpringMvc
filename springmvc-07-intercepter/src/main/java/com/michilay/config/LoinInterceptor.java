package com.michilay.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoinInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //判断是否登录
        //登陆页面也放行
        if (request.getRequestURI().contains("inLogin")) {
            return true;
        }
        //第一次登录没有session
        if (request.getRequestURI().contains("login")) {
            return true;
        }

        //登陆了就放行
        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }


        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
