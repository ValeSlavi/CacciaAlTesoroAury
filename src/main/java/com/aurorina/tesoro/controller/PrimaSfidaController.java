package com.aurorina.tesoro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aurorina.tesoro.entity.User;
import com.aurorina.tesoro.service.UserService;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

@Controller
public class PrimaSfidaController {

    @Autowired
    private UserService userService;

    @GetMapping("/PrimaSfida")
    public String showPrimaSfida() {
        return "primaSfida";
    }

    @PostMapping("/PrimaSfida")
    public String checkRisposta(@RequestParam("risposta") String risposta, Model model) {
        String soluzione = "BuonCompleanno!";
        if (risposta != null && risposta.trim().equalsIgnoreCase(soluzione)) {
            model.addAttribute("esito", "Complimenti! Hai risolto la prima sfida.");
        } else {
            model.addAttribute("esito", "Risposta errata. Riprova!");
        }
        return "primaSfida";
    }
}
