package com.example.onlineeducationplatform.mapper;

import com.example.onlineeducationplatform.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectUserById(int id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
