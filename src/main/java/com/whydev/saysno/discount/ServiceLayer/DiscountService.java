package com.whydev.saysno.discount.ServiceLayer;

import com.whydev.saysno.discount.DataAccessLayer.DiscountDTO;
import com.whydev.saysno.discount.ServiceLayer.policy.DiscountPolicy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {

    private List<DiscountPolicy> discountPolicies;

    public DiscountService(List<DiscountPolicy> discountPolicies) {
        this.discountPolicies = discountPolicies;
    }

    public DiscountDTO discount(DiscountDTO request) {
        // validateDiscountRequest(request);
        int discountAmount = calculateDiscountAmount(request);
        DiscountDTO result = new DiscountDTO();
        result.setDiscountAmount(discountAmount);

        return result;
    }

    // private void validateDiscountRequest(DiscountRequest request) {
    // }

    private int calculateDiscountAmount(DiscountDTO request) {
        int discountAmount = 0;
        for (DiscountPolicy discountPolicy : discountPolicies) {
            if (discountPolicy.isSatisfiedBy(request)) {
                discountAmount += discountPolicy.calculate(request).getOriginPrice();
            }
        }
        return discountAmount;
    }

}
