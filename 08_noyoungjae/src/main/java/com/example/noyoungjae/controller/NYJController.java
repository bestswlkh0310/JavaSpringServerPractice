package com.example.noyoungjae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class NYJController {
    @GetMapping("/go")
    public String go() {
        return "go";
    }

    @GetMapping("/nonogram")
    public String nonogram() {
        return "nono";
    }
}
