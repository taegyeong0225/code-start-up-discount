package com.whydev.saysno.discount;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class PriceChangeTest {
    DiscountDTO discountDTO = DiscountDTO.builder().category(10).build();
}
