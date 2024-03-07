package com.whydev.saysno.discount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ApiController {

    private final DiscountService discountService;

    public ApiController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping("/discount")
    public DiscountDTO getDiscountInfo(DiscountRequest discountRequest) {
        return discountService.discount(discountRequest);
    }
}
