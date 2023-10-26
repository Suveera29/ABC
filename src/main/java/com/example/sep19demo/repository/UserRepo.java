package com.example.sep19demo.repository;

import com.example.sep19demo.dto.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component//its create abin out of it
public class UserRepo {

    List<User> users = new ArrayList<>();

    public List<User> addUser(User user){
        users.add(user);
        return users;
    }

    public List<User> getAllUser(){
        return users;
    }


    public List<User> deleteUser(){
        return null;
    }

    public List<User> updateAll(User user) {
        users.add(user);
        return users;

    }
}
