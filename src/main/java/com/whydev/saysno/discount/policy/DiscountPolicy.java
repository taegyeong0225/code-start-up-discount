package com.whydev.saysno.discount.policy;

import com.whydev.saysno.discount.DiscountRequest;

public interface DiscountPolicy {
    // 할인 정책 정의 인터페이스

    // 할인 정책 확인
    boolean isSatisfiedBy(DiscountRequest discountDTO);

    // 계산
    int calculate(DiscountRequest discountDTO);
}
