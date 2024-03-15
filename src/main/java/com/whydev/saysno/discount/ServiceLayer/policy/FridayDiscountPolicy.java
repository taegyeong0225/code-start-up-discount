package com.whydev.saysno.discount.ServiceLayer.policy;

import com.whydev.saysno.discount.DataAccessLayer.DiscountDTO;
import com.whydev.saysno.discount.DataAccessLayer.Money;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayDiscountPolicy implements DiscountPolicy {
    // 현재 요일이 금요일인 경우 모든 상품 10% 할인
    @Override
    public boolean isSatisfiedBy(DiscountDTO discountDTO) {
        // 금요일인 경우
        LocalDate currentDate = LocalDate.now();
        DayOfWeek weekDay = currentDate.getDayOfWeek();

        return weekDay == DayOfWeek.FRIDAY; // 열거형 데이터
    }

    @Override
    public Money calculate(DiscountDTO discountDTO) {
        // 모든 상품 10% 할인
        Money originalPrice = discountDTO.getOriginPrice();
        double discountedPrice = originalPrice.getOriginPrice() * 0.1;
        return new Money(discountedPrice);
    }
}
