package com.whydev.saysno.discount.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DiscountRequest {
    private Double price;
    private String category;

    public boolean isValidate() {
        if (price == null) {
            return false;
        }
        if(price < 0) {
            return false;
        }
        if (category == null) {
            return false;
        }
        return true;
    }
}
