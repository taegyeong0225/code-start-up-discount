package com.whydev.saysno.discount;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DiscountRequest {
    private final DiscountService discountService;

    public DiscountRequest(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping("/discount")
    public ResponseEntity<String> getDiscount() {
        DiscountDTO discountDTO = new DiscountDTO();

        String discountInfo = discountService.discount(discountDTO).toString();

        return ResponseEntity.ok(discountInfo);
    }
}
