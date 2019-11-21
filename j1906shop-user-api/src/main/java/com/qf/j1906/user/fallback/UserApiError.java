package com.qf.j1906.user.fallback;

import com.qf.j1906.common.po.JdUser;
import com.qf.j1906.user.api.UserApi;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserApiError implements UserApi {
    @Override
    public JdUser verifyRemote(String username) {
        return null;
    }

    @Override
    public List<JdUser> selectUsers() {
        return null;
    }
}
