package com.hvt.rest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hvt.rest.repository.UserRepository;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController //Following annotation is needed in order to allow the URL mapping
public class UserController {
    
    @GetMapping("/users")
    String  getUsers(){
        return "This is our user data";
    }
    @PostMapping("create/user")
    public String postUser(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    @PutMapping("user/{id}")
    public String updateUser(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }
    @DeleteMapping("user/{id}")
    public String deleteUser(@PathVariable int id){

        return "User was deleted succesfully...";

    }

}
