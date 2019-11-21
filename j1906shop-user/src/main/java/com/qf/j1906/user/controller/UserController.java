package com.qf.j1906.user.controller;


import com.qf.j1906.common.po.JdUser;

import com.qf.j1906.user.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//提供者
@RestController
public class UserController {
private static final Logger logger = LogManager.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value="/verity",method= RequestMethod.GET)
    public JdUser verify(@RequestParam("uname") String uname){
        return null;
    }

    //全查
    @CrossOrigin
    @RequestMapping(value="/users",method= RequestMethod.GET)
    public List<JdUser> selectUsers(){
        List<JdUser> users = userService.selectUsers();
        logger.info(users.toString());
        return users;
    }

    //删除用户信息
    @CrossOrigin
    @RequestMapping(value = "/userdelete",method = RequestMethod.DELETE)
    public Boolean deleteUserById(@RequestParam("uid") int uid){
        boolean b = userService.deleteUserById(uid);
        return b;
    }

}
