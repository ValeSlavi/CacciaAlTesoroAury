package com.aurorina.tesoro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class DuckIndizioController {
    private static final String[] DUCKS = {
        "duck1.jpg", "duck2.jpg", "duck3.jpg", "duck4.jpg", "duck5.jpg", "duck6.jpg", "duck7.jpg", "duck8.jpg", "duck9.jpg", "duck10.jpg", "duck11.jpg", "duck12.jpg", "duck13.jpg", "duck14.jpg", "duck15.jpg", "duck16.jpg", "duck17.jpg"
    };

    @GetMapping("/DuckIndizio")
    public String showRandomDuckIndizio(Model model) {
        int idx = new Random().nextInt(DUCKS.length);
        model.addAttribute("duckImg", DUCKS[idx]);
        return "duckIndizio";
    }
}
