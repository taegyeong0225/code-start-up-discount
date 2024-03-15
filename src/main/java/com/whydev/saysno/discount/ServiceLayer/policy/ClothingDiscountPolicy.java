package com.whydev.saysno.discount.ServiceLayer.policy;

import com.whydev.saysno.discount.DataAccessLayer.DiscountDTO;
import com.whydev.saysno.discount.DataAccessLayer.Money;

public class ClothingDiscountPolicy implements DiscountPolicy {
    // 상품 카테고리가 의류인 경우 5% 할인
    @Override
    public boolean isSatisfiedBy(DiscountDTO discountDTO) {
        return discountDTO.getCategory() == DiscountDTO.Category.CLOTHS; // 예시로 의류 카테고리가 10일 경우에만 true 반환
    }

    @Override
    public Money calculate(DiscountDTO discountDTO) {
        Money originalPrice = discountDTO.getOriginPrice();
        double discountedPrice = originalPrice.getOriginPrice() * 0.05;
        return new Money(discountedPrice);
    }


}
