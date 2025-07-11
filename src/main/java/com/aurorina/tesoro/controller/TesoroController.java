package com.aurorina.tesoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TesoroController {

    // This method maps the root URL to the "index" view, home page of the application
    @GetMapping("/")
    public String getTesoroPage() {
        return "index";
    }

}
