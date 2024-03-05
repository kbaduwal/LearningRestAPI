package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int theId);

    void save(User theUSer);

    void deleteById(int theId);


}
