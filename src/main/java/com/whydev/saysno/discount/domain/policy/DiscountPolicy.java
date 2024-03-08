package com.whydev.saysno.discount.domain.policy;

import com.whydev.saysno.discount.domain.dto.DiscountRequest;

public interface DiscountPolicy {

    // 할인 정책 확인
    boolean isSatisfiedBy(DiscountRequest request);

    // 계산
    int calculate(DiscountRequest request);
}
