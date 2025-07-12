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
public class InizioController {
    @Autowired
    private UserService userService;

    @GetMapping("/inizio")
    public String showLoginForm() {
        return "inizio";
    }

    @PostMapping("/inizio")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model,
                        HttpSession session) {
        User user = userService.authenticate(username, password);
        if (user != null) {
            session.setAttribute("utente", user);
            if (user.getUsername().equals("Bad Girl")) {
                return "redirect:/PrimaSfida";
            } else if(user.getUsername().equals("Valentina")){
                return "redirect:/secondaSfida";
            } else {
                return "redirect:/";
            }
        } else {
            model.addAttribute("errorMessage", "&#x1F424; <strong>Non ti ricordi come ti ho salvato faccia da schiaffi?? <br>PS Non ti ho salvata \"faccia da schiaffi\"</strong> &#x1F424;<br><img src='/img/duck17.jpg' alt='Papera'>");
            return "inizio";
        }
    }
}
