package com.whydev.saysno.discount.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {

    @GetMapping("/home")
    public String landingPage(Model model) {

        return "home";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        return "register";
    }

    @PostMapping("/register")
    public String save (@RequestParam("product") String product,
                        @RequestParam("category") String category,
                        @RequestParam("original-price") int original_price) {

        System.out.println("저장 완료");
        System.out.println("product = " + product + ", category = " + category + ", original_price = " + original_price);
        return "home";
    }
}
