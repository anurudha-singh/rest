package com.hvt.rest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hvt.rest.entities.User;
import com.hvt.rest.repository.UserRepository;
import com.hvt.rest.services.UserService;
import com.hvt.rest.services.UserServiceImplementation;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController //Following annotation is needed in order to allow the URL mapping
public class UserController {
    
    @Autowired
    UserServiceImplementation userServiceImplementation;
    @GetMapping("/users")
    List<User>  getUsers(){
       return  userServiceImplementation.getAllUsers();
        // return "This is our user data";
    }
    @PostMapping("create/user")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        System.out.println("At line 35");
        System.out.println(user);
       return new ResponseEntity<User>(userServiceImplementation.createUser(user), HttpStatus.CREATED);
    }
    @PutMapping("user/{id}")
    public String updateUser(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        userServiceImplementation.updateUser(Integer.parseInt(id));
        
        return entity;
    }
    @DeleteMapping("user/{id}")
    public String deleteUser(@PathVariable int id){
// userService.deleteUser();
        return "User was deleted succesfully...";

    }

}
