package com.spring.service.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.exception.UserNotFoundException;
import com.spring.service.UserService;
import com.spring.user.entity.User;
import com.spring.user.entity.UserRole;
import com.spring.user.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements userde{

    @Autowired
    private UserRepository userRepository;


}
