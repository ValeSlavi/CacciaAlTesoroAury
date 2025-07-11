package com.aurorina.tesoro.service;

import com.aurorina.tesoro.entity.User;
import com.aurorina.tesoro.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User authenticate(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
