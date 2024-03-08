package com.whydev.saysno.discount.domain.policy;

import com.whydev.saysno.discount.domain.dto.DiscountRequest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayDiscountPolicy implements DiscountPolicy {
    // 현재 요일이 금요일인 경우 모든 상품 10% 할인
    @Override
    public boolean isSatisfiedBy(DiscountRequest request) {
        // 금요일인 경우
        LocalDate currentDate = LocalDate.now();
        DayOfWeek weekDay = currentDate.getDayOfWeek();

        return weekDay == DayOfWeek.FRIDAY; // 열거형 데이터
    }

    @Override
    public int calculate(DiscountRequest request) {
        // 모든 상품 10% 할인
        Double originalPrice = request.getPrice();
        return (int) (originalPrice * 0.1);
    }
}
