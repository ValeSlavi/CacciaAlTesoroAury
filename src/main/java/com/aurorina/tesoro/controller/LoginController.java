package com.aurorina.tesoro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aurorina.tesoro.entity.User;
import com.aurorina.tesoro.service.UserService;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

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
                        Model model,
                        HttpSession session) {
        User user = userService.authenticate(username, password);
        if (user != null) {
            session.setAttribute("utente", user);
            if (user.getUsername().equals("BadGirl")) {
                return "redirect:/PrimaSfida";
            } else if(user.getUsername().equals("Valentina")){
                return "redirect:/secondaSfida";
            } else {
                return "redirect:/";
            }
        } else {
            model.addAttribute("error", "Credenziali non valide");
            return "login";
        }
    }
}
