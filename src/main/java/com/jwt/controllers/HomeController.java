package com.jwt.controllers;

import com.jwt.models.User;
import com.jwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> users()
    {
        System.out.println("Getting all users..");
        return this.userService.getAllUsers();
    }

    @GetMapping("/currentUser")
    public String getCurrentUser(Principal principal)
    {
        return principal.getName();
    }
}
