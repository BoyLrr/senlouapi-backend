package com.lee.senapiinterface.controller;


import com.lee.senlouapiclientsdk.model.User;
import com.lee.senlouapiclientsdk.utils.SignUtils;
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
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String body = request.getHeader("body");
        String sign = request.getHeader("sign");
        //todo accessKey应该去数据库拿
        if (!accessKey.equals("lalala")){
            throw new RuntimeException("无权限");
        }
        if (Long.parseLong(nonce) > 10000){
            throw new RuntimeException("无权限");
        }
        //todo timestamp也应该校验，和当前时间不能超过5分钟
//        if (timestamp){
//
//        }
        //todo 实际应该从数据库拿到secretKey再加密再校验
        String serverSign = SignUtils.genSign(body, "12345678");//这里的加密规则要和生成密钥的地方一样
        if (!sign.equals(serverSign)){
            throw new RuntimeException("无权限");
        }
        String result =  "POST 用户名 "+user.getUsername();

        return result;
    }
}
