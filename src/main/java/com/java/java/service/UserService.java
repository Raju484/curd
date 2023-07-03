package com.java.java.service;

import com.java.java.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User>  fetchAllUsers();

    Optional<User> getUserById(Long id);

}
