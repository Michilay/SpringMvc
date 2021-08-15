package com.michilay.controller;


import com.michilay.pojo.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test( ){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:para=>" +name);
        if ("michilay".equals(name)){
            response.getWriter().println("true");
        }else {
            response.getWriter().println("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        ArrayList<User> userList = new ArrayList<>();
        //添加数据
        userList.add(new User("java",1,"男"));
        userList.add(new User("mysql",2,"男"));
        userList.add(new User("js",3,"女"));
        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        if(name != null){
            //admin应该在数据库
            if (("admin".equals(name))){
                msg = "ok";
            }
            else {
                msg = "用户名有误";
            }
        }
        if(pwd != null){
            //admin应该在数据库
            if (("123".equals(pwd))){
                msg = "ok";
            }
            else {
                msg = "密码有误";
            }
        }
        return msg;
    }
}
