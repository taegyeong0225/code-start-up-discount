package com.whydev.saysno.discount;

import com.whydev.saysno.discount.policy.DiscountPolicy;
//import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class DiscountService {

    private static List<DiscountPolicy> discountPolicies;
    public static DiscountDTO discount(DiscountRequest request) {
        // validation
        // - errors

        // 할인 로직

        int discountAmount = 0;
        for (DiscountPolicy discountPolicy : discountPolicies) {
            if (discountPolicy.isSatisfiedBy(request)) {
                discountAmount += discountPolicy.calculate(request);
            }
        }

        DiscountDTO result = new DiscountDTO();
        return result;
    }
}
