package com.qf.j1906.user.api;

import com.qf.j1906.common.po.JdUser;
import com.qf.j1906.user.fallback.UserApiError;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="j1906shop-user",fallback= UserApiError.class)
public interface UserApi {
    @RequestMapping(value="/verity",method= RequestMethod.GET)
    public JdUser verifyRemote(@RequestParam("uname")String uname);

    @RequestMapping(value="/users",method= RequestMethod.GET)
    public List<JdUser> selectUsers();
}
