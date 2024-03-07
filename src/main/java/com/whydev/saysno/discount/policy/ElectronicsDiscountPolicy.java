package com.whydev.saysno.discount.policy;

import com.whydev.saysno.discount.DiscountDTO;
import com.whydev.saysno.discount.DiscountRequest;

public class ElectronicsDiscountPolicy implements DiscountPolicy {
    // 상품 카테고리가 전자기기인 경우 1만원 할인 or 5% 할인 중에서 최대 할인 적용
    @Override
    public boolean isSatisfiedBy(DiscountDTO discountDTO) {
        return discountDTO.getCategory() == 20;
    }

    @Override
    public int calculate(DiscountDTO discountDTO) {
        // 1만원 할인 or 5% 할인 중에서 최대 할인 적용
        int originalPrice = discountDTO.getOriginPrice();
        int fivePerPrice = (int) (originalPrice * 0.05);
        int tenThousandPrice = originalPrice - 10000;

        return Math.min(fivePerPrice, tenThousandPrice);
    }
}
