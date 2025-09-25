package com.example.demo_spring_boot_devops.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo_spring_boot_devops.entity.User;
import com.example.demo_spring_boot_devops.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class DevOpsController {

    private final UserService userService;

    public DevOpsController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-data")
    public String getData() {
        return "Hello DevOps, how are you?";
    }

    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user) {
        User saved = userService.saveUser(user);
        return ResponseEntity.status(201).body(saved);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @Valid @RequestBody User userDetails) {
        User updated = userService.updateUser(id, userDetails);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
