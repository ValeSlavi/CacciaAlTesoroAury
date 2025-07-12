package com.aurorina.tesoro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class SecondaSfidaController {
    @GetMapping("/secondaSfida")
    public String showSecondaSfida() {
        return "secondaSfida";
    }

    @PostMapping("/secondaSfida")
    public String checkRisposta(@RequestParam("risposta") String risposta, Model model) {
        String soluzione = "flag{HaiRisoltoLEnigma}";
        if (risposta != null && risposta.trim().equals(soluzione)) {
            model.addAttribute("esito", "Complimenti! Hai risolto la seconda sfida.");
        } else {
            model.addAttribute("esito", "Risposta errata. Riprova!");
        }
        return "secondaSfida";
    }
}
