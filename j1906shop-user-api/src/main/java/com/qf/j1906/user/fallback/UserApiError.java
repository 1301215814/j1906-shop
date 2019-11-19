package com.qf.j1906.user.fallback;

import com.qf.j1906.user.api.UserApi;
import com.qf.j1906.user.po.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class UserApiError implements UserApi {
    @Override
    public UserInfo verifyRemote(String username) {
        return null;
    }
}
