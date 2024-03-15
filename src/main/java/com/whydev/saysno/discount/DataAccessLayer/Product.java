package com.whydev.saysno.discount.DataAccessLayer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Product {
    @Id
    private Long id;
    @Column
    private Money originPrice;
    @Column
    private DiscountDTO.Category category;
    @Column
    private int discountAmount;
}
