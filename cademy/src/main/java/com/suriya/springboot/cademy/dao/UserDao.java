package com.suriya.springboot.cademy.dao;

import com.suriya.springboot.cademy.entity.User;

public interface UserDao {
    User findUserByUserName(String userName);
    void save(User user);
}
