package com.whydev.saysno.discount.controller;

import com.whydev.saysno.discount.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
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
    public String save (@ModelAttribute ProductDTO productDTO) {
        System.out.println("저장 완료");
        System.out.println("productDTO : " + productDTO);
        return "home";
    }


}
