package com.sprboot.eventapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";  // this means: look for src/main/resources/templates/index.html
    }
}
