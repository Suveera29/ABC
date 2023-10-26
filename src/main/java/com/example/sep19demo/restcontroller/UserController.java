package com.example.sep19demo.restcontroller;

import com.example.sep19demo.dto.User;
import com.example.sep19demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired//setter based dependency injection
    UserRepo userRepo;


    @GetMapping("/1")

    public User getUser(){
        User user = User.builder().firstName("Suveera").lastName("Choudhary").age(22).build();
        return user;
    }
    @GetMapping("/2")

    public User getUser1(){
        User user = User.builder().firstName("jas").lastName("Choudhary").age(23).build();
        return user;
    }
    @GetMapping("/3")

    public User getUser2(){
        User user = User.builder().firstName("Prachi").lastName("Choudhary").age(23).build();
        return user;
    }
    @GetMapping("/4")

    public User getUser3(){
        User user = User.builder().firstName("Deepanshu").lastName("Choudhary").age(24).build();
        return user;
    }
    @PostMapping("/post")//we need to user data from the body
    public List<User> InsertUser(@RequestBody User user){
       return userRepo.addUser(user);

    }
    @GetMapping("/getAll")
    public List<User> getAllUser(){

        return userRepo.getAllUser();
    }
    @PatchMapping("/update")
    public List<User> updateUser(@RequestBody User user){
        return userRepo.updateAll(user);
    }
    @DeleteMapping("/delete")
    public List<User> deleteuser(){
        return userRepo.deleteUser();
    }

}
//entry point
// we are using request body in post mapping to get data outside from the body
