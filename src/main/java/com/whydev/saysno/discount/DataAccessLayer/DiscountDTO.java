package com.whydev.saysno.discount.DataAccessLayer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountDTO {
    private Long id;
    private Money originPrice;
    private Category category;
    private int discountAmount;

    public DiscountDTO() {

    }

    public enum Category {
        CLOTHS, ELECTRONICS, FOODS
    }
}
