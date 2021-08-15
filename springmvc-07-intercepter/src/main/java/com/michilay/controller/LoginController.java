package com.michilay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.nio.cs.ext.MacDingbat;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/inMain")
    public String inMain() {
        return "main";
    }

    @RequestMapping("/inLogin")
    public String inLogin() {
        return "login";
    }

    @RequestMapping("login")
    public String login(HttpSession session, String username, String password, Model model) {
        //把用户信息存在session中
        session.setAttribute("userLoginInfo", username);
        model.addAttribute("username", username);
        return "main";
    }

    @RequestMapping("out")
    public String out(HttpSession session, String username, String password, Model model) {
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
