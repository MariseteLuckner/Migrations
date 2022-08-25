package com.example.flyway.controller;

import com.example.flyway.model.User;
import com.example.flyway.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<User> listAll() {
        return userRepository.findAll();
    }
}
