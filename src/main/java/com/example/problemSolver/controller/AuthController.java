package com.example.problemSolver.controller;

import com.example.problemSolver.entity.User;
import com.example.problemSolver.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/registration")
    public String getRegistrationPage(Model model) {
        return "registration";
    }

    @RequestMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

    @PostMapping("/registration")
    public String getRegistrationPage(@ModelAttribute User user, Model model) {
        userRepository.save(user);

        return "success";
    }

    @RequestMapping("/success")
    public String getSuccessPage(Model model) {
        return "success";
    }
}
