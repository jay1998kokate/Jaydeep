package com.example.assignment;

import com.example.usermanagement.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // Implement the addUser endpoint
    @PostMapping
    public User addUser(@RequestBody User user) {
        // Add logic to save the user to the database
        return user;
    }

    // Implement the getUser/{userId} endpoint
    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        // Add logic to retrieve a user by ID from the database
        return null; // Replace with actual logic
    }
// Implement the getAllUser endpoint
@GetMapping
public List<User> getAllUser() {
    // Add logic to retrieve all users from the database
    return null; // Replace with actual logic
}

// Implement the updateUserInfo endpoint
@PutMapping("/{userId}")
public User updateUserInfo(@PathVariable Long userId, @RequestBody User updatedUser) {
    // Add logic to update user information in the database
    return null; // Replace with actual logic
}

// Implement the deleteUser endpoint
@DeleteMapping("/{userId}")
public void deleteUser(@PathVariable Long userId) {
    // Add logic to delete a user by ID from the database
}
}