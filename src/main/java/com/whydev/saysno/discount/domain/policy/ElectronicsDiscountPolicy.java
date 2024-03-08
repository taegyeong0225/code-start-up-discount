package com.whydev.saysno.discount.domain.policy;

import com.whydev.saysno.discount.domain.dto.DiscountRequest;

public class ElectronicsDiscountPolicy implements DiscountPolicy {
    // 상품 카테고리가 전자기기인 경우 1만원 할인 or 5% 할인 중에서 최대 할인 적용
    @Override
    public boolean isSatisfiedBy(DiscountRequest request) {
        return request.getCategory() == "food";
    }

    @Override
    public int calculate(DiscountRequest request) {
        // 1만원 할인 or 5% 할인 중에서 최대 할인 적용
        Double originalPrice = request.getPrice();
        int fivePerPrice = (int) (originalPrice * 0.05);
        int tenThousandPrice = (int) (originalPrice - 10000);

        return Math.min(fivePerPrice, tenThousandPrice);
    }
}
