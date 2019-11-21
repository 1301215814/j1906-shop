package com.qf.j1906.user.service;

import com.qf.j1906.common.po.JdUser;


import java.util.List;

public interface UserService {

    public List<JdUser> selectUsers();

    public boolean deleteUserById(int uid);
}
