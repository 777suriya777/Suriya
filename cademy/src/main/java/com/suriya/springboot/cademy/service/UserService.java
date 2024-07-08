package com.suriya.springboot.cademy.service;

import com.suriya.springboot.cademy.entity.User;
import com.suriya.springboot.cademy.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findUserByUserName(String userName);
    void save(WebUser webUser);
}
