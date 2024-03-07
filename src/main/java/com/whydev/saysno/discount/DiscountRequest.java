package com.whydev.saysno.discount;

import org.springframework.beans.factory.annotation.Autowired;
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
        // Assuming that discountService.discount() returns a String result
        String discountInfo = discountService.discount(new DiscountRequest(discountService)).toString();

        return ResponseEntity.ok(discountInfo);
    }
}
