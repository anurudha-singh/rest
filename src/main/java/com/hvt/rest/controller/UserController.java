package com.hvt.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Following annotation is needed in order to allow the URL mapping
public class UserController {
    
    @GetMapping("/test")
    String  helloWorld(){
        return "Hello World!";
    }
}
