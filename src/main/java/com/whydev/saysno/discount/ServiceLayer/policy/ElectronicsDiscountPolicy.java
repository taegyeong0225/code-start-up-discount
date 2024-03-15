package com.whydev.saysno.discount.ServiceLayer.policy;

import com.whydev.saysno.discount.DataAccessLayer.DiscountDTO;
import com.whydev.saysno.discount.DataAccessLayer.Money;

public class ElectronicsDiscountPolicy implements DiscountPolicy {
    // 상품 카테고리가 전자기기인 경우 1만원 할인 or 5% 할인 중에서 최대 할인 적용
    @Override
    public boolean isSatisfiedBy(DiscountDTO discountDTO) {
        return discountDTO.getCategory() == DiscountDTO.Category.CLOTHS;
    }

    @Override
    public Money calculate(DiscountDTO discountDTO) {
        // 1만원 할인 or 5% 할인 중에서 최대 할인 적용
        Money originalPrice = discountDTO.getOriginPrice();
        double fivePerPrice = originalPrice.getOriginPrice() * 0.05;
        double tenThousandPrice = originalPrice.getOriginPrice() - 10000;
        double discountedPrice =  Math.min(fivePerPrice, tenThousandPrice);

        return new Money(discountedPrice);
    }
}
