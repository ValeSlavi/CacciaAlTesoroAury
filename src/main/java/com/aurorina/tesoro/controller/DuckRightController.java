package com.aurorina.tesoro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DuckRightController {

    @GetMapping("/duckRight")
    public String showDuckRight() {
        return "duckRight";
    }
}