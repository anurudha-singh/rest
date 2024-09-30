package com.hvt.rest.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.hvt.rest.repository.UserRepository;

public class UserServiceImplementation  implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void getAllUsers(){
        userRepository.findAll();
    }
    @Override
    public void createUser(){
        // userRepository.save();

    }
    @Override
    public void updateUser(){

    }

    @Override
    public void deleteUser(){

    }
    
}
