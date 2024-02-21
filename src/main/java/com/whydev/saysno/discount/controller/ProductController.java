package com.whydev.saysno.discount.controller;

import com.whydev.saysno.discount.ProductService;
import com.whydev.saysno.discount.dto.ProductDTO;
import com.whydev.saysno.discount.entity.ProductEntity;
import com.whydev.saysno.discount.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // 기본 페이지
    @GetMapping("/home")
    public String landingPage(Model model) {
        return "home";
    }

    // 등록 페이지
    @GetMapping("/register")
    public String registerPage(Model model) {
        return "register";
    }

    // 등록
    @PostMapping("/register")
    public String save (@ModelAttribute ProductDTO productDTO) {
        System.out.println("저장 완료");
        System.out.println("productDTO : " + productDTO);
        return "list";
    }

    // 제품 목록
    @GetMapping("/list")
    public String list(Model model) {
        ArrayList<ProductEntity> productEntityList = ProductRepository.findAll();
        model.addAttribute("productList", productEntityList);
        return "list";
    }


}
