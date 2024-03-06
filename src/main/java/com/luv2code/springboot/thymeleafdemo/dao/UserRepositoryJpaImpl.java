package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class UserRepositoryJpaImpl implements UserRepository{
    //Define field for Entity manager
    private EntityManager entityManager;

    //Setup Constructor Injection
    public UserRepositoryJpaImpl(EntityManager theEntityManager){
        //theEntityManager->automatically Created by Spring Boot (Constructor injection)
        entityManager = theEntityManager;

    }
    @Override
    public List<User> findAllByOrderByLastNameAsc() {
       //Create a Query
        TypedQuery<User> theQuery = entityManager.createQuery("from User", User.class);

        //Execute query and get result list
        List<User> users = theQuery.getResultList();

        //return the results
        return users;

    }

    @Override
    public User findById(int theId) {
        //get user
        User theUser = entityManager.find(User.class, theId);

        //return user
        return theUser;

    }

    @Override
    public User save(User theUser) {
        //Save User [if id==0 the insert/save else update]
        User dbUser = entityManager.merge(theUser);

        //return dbUser
        return dbUser;
    }

    @Override
    public void deleteById(int theId) {
        //find User by id
        User theUser = entityManager.find(User.class, theId);

        //remove user
        entityManager.remove(theId);

    }
}
