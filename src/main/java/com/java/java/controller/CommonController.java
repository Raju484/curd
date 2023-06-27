package com.java.java.controller;

import com.java.java.entity.User;
import com.java.java.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CommonController {

    @Autowired
    UserRepo userRepo;
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
