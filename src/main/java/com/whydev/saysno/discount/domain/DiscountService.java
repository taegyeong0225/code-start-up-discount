package com.whydev.saysno.discount.domain;

import com.whydev.saysno.discount.domain.dto.DiscountRequest;
import com.whydev.saysno.discount.domain.dto.DiscountResponse;
import com.whydev.saysno.discount.domain.policy.ClothingDiscountPolicy;
import com.whydev.saysno.discount.domain.policy.DiscountPolicy;
import com.whydev.saysno.discount.domain.policy.ElectronicsDiscountPolicy;
import com.whydev.saysno.discount.domain.policy.FridayDiscountPolicy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {

    private List<DiscountPolicy> discountPolicies = List.of(
            new ClothingDiscountPolicy(),
            new ElectronicsDiscountPolicy(),
            new FridayDiscountPolicy()
    );

    public DiscountResponse discount(DiscountRequest request) {
        // 1) validation
        if (!request.isValidate()) throw new IllegalArgumentException("request is not valid");

        // 2) discount
        Double discountAmount = calculateDiscountAmount(request);

        return new DiscountResponse(request.getPrice() - discountAmount);
    }

    private Double calculateDiscountAmount(DiscountRequest request) {
        Double discountAmount = 0d;
        for (DiscountPolicy discountPolicy : discountPolicies) {
            if (discountPolicy.isSatisfiedBy(request)) {
                discountAmount += discountPolicy.calculate(request);
            }
        }
        return discountAmount;
    }
}
