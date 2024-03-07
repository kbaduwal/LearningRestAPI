package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.User;
import com.luv2code.springboot.thymeleafdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //add mapping for GET/user/{userId}
    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable int userId){
        User theUser = userService.findById(userId);

        if(theUser==null){
            throw  new RuntimeException("User id not found - "+userId);
        }
        return theUser;
    }

    //add mapping for POST / employees - add new employee
    @PostMapping("/users")
    public User addUser(@RequestBody User theUser){
        //also just in case they pass an id in JSON --set id to 0
        //this is to force a save of new item ... instead of update

        theUser.setId(0);

        User dbUser = userService.save(theUser);
        return dbUser;

    }


}

