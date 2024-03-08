package com.whydev.saysno.discount.domain;

import com.whydev.saysno.discount.domain.dto.DiscountRequest;
import com.whydev.saysno.discount.domain.dto.DiscountResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1")
@RestController
@RequiredArgsConstructor
public class DiscountController {

    private final DiscountService discountService;

    @GetMapping("/discount")
    public ResponseEntity<DiscountResponse> getDiscountInfo(@RequestBody DiscountRequest request) {
        try {
            DiscountResponse result = discountService.discount(request);
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}