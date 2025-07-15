package com.aurorina.tesoro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TerzaSfidaController {

    @GetMapping("/terzaSfida")
    public String showTerzaSfida() {
        return "terzaSfida";
    }

    @PostMapping("/terzaSfida")
    public String checkRisposta(@RequestParam("risposta") String risposta, Model model) {
        String soluzione = "la-tua-soluzione"; // Sostituisci con la risposta corretta
        if (risposta != null && risposta.trim().equalsIgnoreCase(soluzione)) {
            return "redirect:/prossimaTappa"; // Sostituisci con la pagina successiva
        } else {
            model.addAttribute("esito", "&#x1F425; <strong>Risposta sbagliata!</strong> &#x1F425;<br><img src='/img/duck1.jpg' alt='Papera'>");
            return "terzaSfida";
        }
    }
}