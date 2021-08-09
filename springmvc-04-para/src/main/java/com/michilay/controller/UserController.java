package com.michilay.controller;


import com.michilay.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    //localhost:8080/u1/t1?name=xxxx
    @GetMapping("/u1/t1")
    public String test1(String name,Model model){
        //1.接受前端参数
        System.out.println("接收到前端的参数为："+name);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",name);
        //3.跳转视图
        return "user";
    }
    //localhost:8080/u1/t1?username=xxxx
    @GetMapping("/u1/t2")
    public String test2(@RequestParam("username") String name, Model model){
        //1.接受前端参数
        System.out.println("接收到前端的参数为："+name);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",name);
        //3.跳转视图
        return "user";
    }
    //http://localhost:8080/u1/t3?id=1&name=michilay&age=21
    @GetMapping("/u1/t3")
    public String test3(User user, Model model){
        //1.接受前端参数
        System.out.println("接收到前端的参数为："+user);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",user);
        //3.跳转视图
        return "user";
    }
}
