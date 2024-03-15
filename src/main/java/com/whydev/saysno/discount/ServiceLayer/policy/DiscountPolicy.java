package com.whydev.saysno.discount.ServiceLayer.policy;

import com.whydev.saysno.discount.DataAccessLayer.DiscountDTO;
import com.whydev.saysno.discount.DataAccessLayer.Money;

public interface DiscountPolicy {

    // 할인 정책 확인
    boolean isSatisfiedBy(DiscountDTO discountDTO);

    // 계산
    Money calculate(DiscountDTO discountDTO);
}
