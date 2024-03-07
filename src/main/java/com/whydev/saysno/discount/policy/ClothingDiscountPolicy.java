package com.whydev.saysno.discount.policy;

import com.whydev.saysno.discount.DiscountDTO;
import com.whydev.saysno.discount.DiscountRequest;

public class ClothingDiscountPolicy implements DiscountPolicy {
    // 상품 카테고리가 의류인 경우 5% 할인
    @Override
    public boolean isSatisfiedBy(DiscountDTO discountDTO) {
        return discountDTO.getCategory() == 10; // 예시로 의류 카테고리가 10일 경우에만 true 반환
    }

    @Override
    public int calculate(DiscountDTO discountDTO) {
        int originalPrice = discountDTO.getOriginPrice();
        return (int) (originalPrice * 0.05);
    }

}
