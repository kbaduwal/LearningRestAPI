package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAllByOrderByLastNameAsc();
    User findById(int theId);
    User save(User theUser);
    void  deleteById(int theId);
}
