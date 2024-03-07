package com.whydev.saysno.discount;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountDTO {
    private Long id;
    private int originPrice;
    private int category;
    private int DiscountAmount;
}
