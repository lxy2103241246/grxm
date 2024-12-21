package com.example.onlineeducationplatform.service;

import com.example.onlineeducationplatform.model.User;

public interface UserService {
    User getUserById(int id);

    /**
     * 注册
     * @param user
     */
    void register(User user);
}

