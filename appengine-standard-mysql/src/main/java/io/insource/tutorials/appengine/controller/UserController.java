package io.insource.tutorials.appengine.controller;

import io.insource.tutorials.appengine.entity.User;
import io.insource.tutorials.appengine.repository.UserRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;

    @Inject
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/:id")
    public User getUser(@PathVariable("id") Long id) {
        return userRepository.findOne(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/users/:id")
    public User createUser(@PathVariable("id") Long id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }
}
