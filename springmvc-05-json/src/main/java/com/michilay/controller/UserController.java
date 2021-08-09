package com.michilay.controller;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.michilay.pojo.User;
import com.michilay.utils.JsonUtils;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

//    不走视图解析器，直接返回一个字符串
    @SneakyThrows
    @RequestMapping(value = "/j1")
    public String json1(){

//        jackson,objectmapper
        ObjectMapper objectMapper = new ObjectMapper();

        User user = new User("michilay", 123, "男");
        String s = objectMapper.writeValueAsString(user);
        System.out.println(s);
        return s;
    }

    @SneakyThrows
    @RequestMapping(value = "/j2")
    public String json2(){
        ObjectMapper objectMapper = new ObjectMapper();

        User user1 = new User("michilay1", 123, "男");
        User user2 = new User("michilay2", 123, "男");
        User user3 = new User("michilay3", 123, "男");
        User user4 = new User("michilay4", 123, "男");
        User user5 = new User("michilay5", 123, "男");
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);


//        String s = objectMapper.writeValueAsString(userList);
//        System.out.println(s);
//        return s;
        return JsonUtils.getJson(userList);
    }


    @SneakyThrows
    @RequestMapping(value = "/j3")
    public String json3(){
        ObjectMapper objectMapper = new ObjectMapper();
        Date data = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm;ss");
        String format = simpleDateFormat.format(data);
        objectMapper.writeValueAsString(format);
        System.out.println(format);
        return format;
    }

    @RequestMapping(value = "/j4")
    public String json4(){
        Date date = new Date();
        return JsonUtils.getJson(date);
    }

    @RequestMapping("j5")
    public String json5(){
        User user1 = new User("michilay1", 123, "男");
        User user2 = new User("michilay2", 123, "男");
        User user3 = new User("michilay3", 123, "男");
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        String s = JSON.toJSONString(userList);
        return s;
    }
}
