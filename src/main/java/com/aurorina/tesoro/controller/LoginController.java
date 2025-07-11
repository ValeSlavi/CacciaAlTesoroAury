package com.aurorina.tesoro.controller;

import com.aurorina.tesoro.service.UserService;
import com.aurorina.tesoro.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {
        User user = userService.authenticate(username, password);
        if (user != null) {
            return "redirect:/";
        } else {
            model.addAttribute("error", "Credenziali non valide");
            return "login";
        }
    }
}
