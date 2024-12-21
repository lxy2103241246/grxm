package com.example.onlineeducationplatform.service;

import com.example.onlineeducationplatform.mapper.UserMapper;
import com.example.onlineeducationplatform.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public void register(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    // 实现其他方法...
}
