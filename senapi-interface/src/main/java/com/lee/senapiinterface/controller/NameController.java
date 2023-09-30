package com.lee.senapiinterface.controller;


import com.lee.senlouapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name){
        return "GET 名字"+name;
    }
    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "POST 名字"+name;
    }
    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
        String result =  "POST 用户名 "+user.getUsername();

        return result;
    }
}
