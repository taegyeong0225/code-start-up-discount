package com.whydev.saysno.discount.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ObjectController {

    @GetMapping("/home")
    public String landingPage(Model model) {

        return "home";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        return "register";
    }
}
