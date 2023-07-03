package com.java.java.controller;

import com.java.java.entity.User;
import com.java.java.repository.UserRepo;
import com.java.java.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CommonController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.fetchAllUsers();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id){
       return  userService.getUserById(id).get();
    }
}
