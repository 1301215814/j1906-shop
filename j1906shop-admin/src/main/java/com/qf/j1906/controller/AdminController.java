package com.qf.j1906.controller;

import com.qf.j1906.common.po.JdUser;
import com.qf.j1906.user.api.UserApi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AdminController {

    private static final Logger logger = LogManager.getLogger(AdminController.class);
    @Autowired
    private UserApi userApi;

    @CrossOrigin
    @RequestMapping(value="/verify/{uname}",method= RequestMethod.GET)
    public JdUser verifyByName(@PathVariable("uname")String uname){
        JdUser jdUser = userApi.verifyRemote(uname);
        return jdUser;
    }

    @CrossOrigin
    @RequestMapping(value="users",method= RequestMethod.GET)
    public List<JdUser> selectUsers(){

        List<JdUser> users = userApi.selectUsers();
        logger.info(users+"------------------------------------------------------------------------*******************");
        return users;
    }
}
