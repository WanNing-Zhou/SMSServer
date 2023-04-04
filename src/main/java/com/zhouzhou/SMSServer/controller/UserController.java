package com.zhouzhou.SMSServer.controller;

import com.zhouzhou.SMSServer.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 周万宁
 * @className UserController
 * @create 2023/4/4-14:12
 * @description 用户模型控制层
 */

@RestController
public class UserController {
    @RequestMapping(value = "/test/ajax",method = RequestMethod.GET)
    public User testAJAX(){
        User user = new User("fdsafkj","fdsf","fdfdsaf",";lkfdsjk","1324564f89787",456478981,"lkjfkldsjfkl");

        return user;
    }


    @RequestMapping(value = "/test/login",method = RequestMethod.POST)
    public User testLogin(@RequestBody User user){

        return user;
    }
    @RequestMapping(value="/test/json",method = RequestMethod.POST)
    public String testJson(@RequestBody Map<String,String> map){
        //@RequestBody 代表接收页面的json数据
        //@ResponseBody: 代表Controller返回json数据
        System.out.println("zwn");
        System.out.println(map.get("username"));
        System.out.println(map.get("password"));
        return "{'state':'ok'}";
    }

}
