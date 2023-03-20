package com.example.dbcontroller.service.interfaces;

import com.example.dbcontroller.model.User;

public interface IUserService {
    User getUserByUserName(String username);

    User getUserByUserId(long userId);

    User saveUser(User user);
}
