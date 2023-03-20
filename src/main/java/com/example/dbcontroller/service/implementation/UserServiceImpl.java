package com.example.dbcontroller.service.implementation;

import com.example.dbcontroller.model.User;
import com.example.dbcontroller.repositories.UserRepository;
import com.example.dbcontroller.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserByUserName(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public User getUserByUserId(long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
