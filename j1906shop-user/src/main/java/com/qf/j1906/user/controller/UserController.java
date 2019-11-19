package com.qf.j1906.user.controller;


import com.qf.j1906.user.po.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//提供者
@RestController
public class UserController {

    @RequestMapping(value="/verity",method= RequestMethod.GET)
    public UserInfo verify(@RequestParam("username") String username){
        return null;
    }
}
