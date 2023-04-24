package com.example.test.demo.services;

import com.example.test.demo.exception.NotFoundException;
import com.example.test.demo.dtos.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static List<User> users = new ArrayList<>();

    static {
        List<String> qualities = new ArrayList<>();
        qualities.add("Self starter");
        qualities.add("Quick learner");
        qualities.add("Communication skills");

        User user1 = User.builder()
                .id("1")
                .name("Wasiq")
                .qualities(qualities)
                .build();

        User user2 = User.builder()
                .id("2")
                .name("John")
                .qualities(qualities)
                .build();

        users.add(user1);
        users.add(user2);
    }


    public List<User> getAllUsers() throws NotFoundException {
        return users;
    }

    public User getSpecificUser(String userId) {

        for (User user: users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new NotFoundException(String.format("User with userId %s not found",userId));
    }
}
