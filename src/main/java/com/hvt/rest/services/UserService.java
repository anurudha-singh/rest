package com.hvt.rest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hvt.rest.entities.User;

@Service
public interface UserService   {
    public List<User> getAllUsers();
    public User createUser(User user);
    public User updateUser(int id);
    public User deleteUser(int id);
}
