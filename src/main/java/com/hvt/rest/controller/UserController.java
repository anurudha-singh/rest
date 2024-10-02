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
    }
    @PostMapping("create/user")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        // System.out.println("At line 35");
        // System.out.println(user);
       return new ResponseEntity<User>(userServiceImplementation.createUser(user), HttpStatus.CREATED);
    }
    @PutMapping("user/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
     return  userServiceImplementation.updateUser(Integer.parseInt(id), user);
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable int id){
       userServiceImplementation.deleteUser(id);
    }

}
