package com.qf.j1906.user.service.Impl;

import com.qf.j1906.common.po.JdUser;
import com.qf.j1906.user.mapper.UserMapper;
import com.qf.j1906.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServierImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<JdUser> selectUsers() {

        List<JdUser> users = userMapper.selectAll();

        return users;
    }

    @Override
    public boolean deleteUserById(int uid) {
        int i = userMapper.deleteByPrimaryKey(uid);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
}
