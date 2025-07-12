package com.aurorina.tesoro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

@Controller
public class PrimaSfidaController {

    @GetMapping("/PrimaSfida")
    public String showPrimaSfida() {
        return "primaSfida";
    }

    @PostMapping("/PrimaSfida")
    public String checkRisposta(@RequestParam("risposta") String risposta, Model model) {
        String r = risposta == null ? "" : risposta.toLowerCase().replaceAll("\\s", "");
        String[] corrette = {
            "capitalesociale=attività-passività",
            "cs=a-p",
            "capitalsociale=attività-passività",
            "capitale=attività-passività"
        };
        boolean giusta = false;
        for (String c : corrette) {
            if (r.equals(c)) {
                giusta = true;
                break;
            }
        }
        if (giusta) {
            return "redirect:/secondaSfida";
        } else {
            model.addAttribute("esito", "🐤 <strong>Non ci siamo!</strong> 🐤<br><img src='/img/duck1.jpg' alt='Papera'>");
            return "primaSfida";
        }
    }
}
