package com.qf.j1906.user.api;

import com.qf.j1906.user.fallback.UserApiError;
import com.qf.j1906.user.po.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="j1906shop-user",fallback= UserApiError.class)
public interface UserApi {
    @RequestMapping(value="/verity",method= RequestMethod.GET)
    public UserInfo verifyRemote(@RequestParam("username")String username);
}
