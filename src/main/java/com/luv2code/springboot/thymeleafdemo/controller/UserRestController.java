package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.User;
import com.luv2code.springboot.thymeleafdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {
    private UserService userService;

    //quick and dirty soln: inject user repository(user constructor injection)
    @Autowired
    public UserRestController(UserService theUserService){
        userService = theUserService;
    }

    //expose "/users" and return a list of users
    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    


}

