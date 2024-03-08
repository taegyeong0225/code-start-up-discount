package com.whydev.saysno.discount.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DiscountResponse {
    @JsonProperty("discount_amount")
    private Double discountAmount;
}
