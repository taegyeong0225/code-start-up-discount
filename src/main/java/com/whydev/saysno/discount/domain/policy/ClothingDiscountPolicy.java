package com.whydev.saysno.discount.domain.policy;

import com.whydev.saysno.discount.domain.dto.DiscountRequest;

public class ClothingDiscountPolicy implements DiscountPolicy {
    // 상품 카테고리가 의류인 경우 5% 할인
    @Override
    public boolean isSatisfiedBy(DiscountRequest request) {
        return request.getCategory().equals("clothes"); // 예시로 의류 카테고리가 10일 경우에만 true 반환
    }

    @Override
    public int calculate(DiscountRequest request) {
        Double originalPrice = request.getPrice();
        return (int) (originalPrice * 0.05);
    }

}
