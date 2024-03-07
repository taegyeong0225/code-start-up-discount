package com.whydev.saysno.discount.policy;

import com.whydev.saysno.discount.DiscountDTO;

public interface DiscountPolicy {

    // 할인 정책 확인
    boolean isSatisfiedBy(DiscountDTO discountDTO);

    // 계산
    int calculate(DiscountDTO discountDTO);
}
