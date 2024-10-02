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
    public User updateUser(int id) {
        User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException());
        System.out.print(existingUser);
        existingUser.setID(200);
        existingUser.setName("Anurudh Singh");
        existingUser.setEmail("hexa@gmail.com");
        existingUser.setAbout("Full stack developer");
        // existingUser.setContact(new Contact(id, "Ani", "Mobile development",
        // "test@gmail.com", "1234567890", existingUser));
        return existingUser;
    }

    @Override
    public User createUser(User user) {
        User userObj = new User();
        userObj.setName("Jane Smith");
        userObj.setEmail("janesmith@example.com");
        userObj.setAbout("A brief description about Jane Smith.");
        
        Contact contact = new Contact();
        contact.setName("Jane Smith");
        contact.setWork("Project Manager");
        contact.setEmail("janesmith@work.com");
        contact.setPhone("987-654-3210");
        
        // Set the reference back to the user
        contact.setUsers(user);
        user.setContact(contact); // Set contact back to the user
        
        return userRepository.save(user);
        
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createUser'");
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
