package com.aurorina.tesoro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aurorina.tesoro.entity.User;
import com.aurorina.tesoro.service.UserService;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;

@Controller
public class LoginInizialeController {
    @Autowired
    private UserService userService;

    @GetMapping("/loginIniziale")
    public String showLoginForm() {
        return "loginIniziale";
    }

    @PostMapping("/loginIniziale")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {
        User user = userService.authenticate(username, password);
        if (user != null) {
            return "redirect:/";
        } else {
            model.addAttribute("error", "Credenziali non valide");
            return "loginIniziale";
        }
    }
}
