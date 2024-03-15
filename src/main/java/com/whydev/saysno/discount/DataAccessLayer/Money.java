package com.whydev.saysno.discount.DataAccessLayer;

import lombok.Getter;

@Getter
public class Money {
    private final double originPrice;

    public Money(double originPrice) {
        this.originPrice = originPrice;
    }
    public double getOriginPrice() {
        return originPrice;
    }
}
