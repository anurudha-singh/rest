package com.hvt.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hvt.rest.entities.User;
import com.hvt.rest.repository.UserRepository;

@Service
public class UserServiceImplementation  implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void getAllUsers(){
        userRepository.findAll();
    }
    @Override
    public void createUser(User user){
        userRepository.save(user);

    }
    @Override
    public void updateUser(){

    }

    @Override
    public void deleteUser(){

    }
    @Override
    public void createUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }
    
}
