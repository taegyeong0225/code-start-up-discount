package com.whydev.saysno.discount;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountDTO {
    private Long id;
    private int originPrice;
    private Category category;
    private int discountAmount;

    // DiscountDTO 생성자
    //    public DiscountDTO(Long id, int originPrice, Category category, int discountAmount) {
    //        this.id = id;
    //        this.originPrice = originPrice;
    //        this.category = category;
    //        this.discountAmount = discountAmount;
    //    }

    // Category Enum 정의
    public enum Category {
        CLOTHS, ELECTRONICS, FOODS
    }
}
