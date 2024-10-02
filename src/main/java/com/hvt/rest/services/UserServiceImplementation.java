package com.hvt.rest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hvt.rest.entities.Contact;
import com.hvt.rest.entities.User;

import com.hvt.rest.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(int id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException());
        
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setAbout(updatedUser.getAbout());
        
        Contact existingContact = existingUser.getContact();
        Contact updatedContact = updatedUser.getContact();
        
        existingContact.setName(updatedContact.getName());
        existingContact.setEmail(updatedContact.getEmail());
        existingContact.setPhone(updatedContact.getPhone());
        existingContact.setWork(updatedContact.getWork());
        
        // Save the user and contact
        return userRepository.save(existingUser);
    }

    @Override
    public User createUser(User user) {
        User userObj = new User();
        userObj.setName(user.getName());
        userObj.setEmail(user.getEmail());
        userObj.setAbout(user.getAbout());

        // User userObj = new User();
        // userObj.setName("Jane Smith");
        // userObj.setEmail("janesmith@example.com");
        // userObj.setAbout("A brief description about Jane Smith.");
        
        Contact contact = new Contact();
        contact.setName(user.getContact().getName());
        contact.setWork(user.getContact().getWork());
        contact.setEmail(user.getContact().getEmail());
        contact.setPhone(user.getContact().getPhone());
        
        // Set the reference back to the user
        contact.setUsers(user);
        user.setContact(contact); // Set contact back to the user
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    // @Override
    // public User deleteUser(){

    // }
}
