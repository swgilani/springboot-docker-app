package com.example.test.demo.controllers;

import com.example.test.demo.dtos.User;
import com.example.test.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping(path="/user")
    public ResponseEntity<List<User>> getAllUsers() {

        List<User> response = userService.getAllUsers();
        return ResponseEntity.ok(response);

    }

    @GetMapping(path="/user/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId) {

        User response = userService.getSpecificUser(userId);
        return ResponseEntity.ok(response);

    }



}
