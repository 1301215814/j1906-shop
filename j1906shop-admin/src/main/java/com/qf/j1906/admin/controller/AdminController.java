package com.qf.j1906.admin.controller;

import com.qf.j1906.user.api.UserApi;
import com.qf.j1906.user.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private UserApi userApi;

    @RequestMapping(value="/verify/{name}",method= RequestMethod.GET)
    public UserInfo verifyByName(@PathVariable("name")String username){
        UserInfo userInfo = userApi.verifyRemote(username);
        return userInfo;
    }
}
