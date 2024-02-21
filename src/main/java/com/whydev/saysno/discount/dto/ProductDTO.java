package com.whydev.saysno.discount.dto;

import com.whydev.saysno.discount.entity.ProductEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductDTO {
    private Long id;
    private String product;
    private String category;
    private int price;
    // private int sale_price;

    public static ProductDTO toProductDTO(ProductEntity productEntity){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProduct(productEntity.getProduct());
        productDTO.setCategory(productEntity.getCategory());
        productDTO.setPrice(productEntity.getPrice());

        applyDiscount(productDTO);

        return productDTO;
    }

    private static void applyDiscount(ProductDTO productDTO) {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek currentDay = currentDate.getDayOfWeek();

        // 금요일인 경우
        if (currentDay == DayOfWeek.FRIDAY) {
            applyPercentageDiscount(productDTO, 10);
        }

        // 카테고리에 따른 할인
        if ("의류".equals(productDTO.getCategory())) {
            applyPercentageDiscount(productDTO, 5);
        } else if ("전자기기".equals(productDTO.getCategory())) {
            applyMaximumDiscount(productDTO, 1000, 5);
        }
    }

    private static void applyPercentageDiscount(ProductDTO productDTO, int percentage) {
        int discountedPrice = (int) (productDTO.getPrice() * (1 - (percentage / 100.0)));
        productDTO.setPrice(discountedPrice);
    }

    private static void applyMaximumDiscount(ProductDTO productDTO, int fixedDiscount, int percentageDiscount) {
        int discountedPrice = Math.min(
                productDTO.getPrice() - fixedDiscount,
                (int) (productDTO.getPrice() * (1 - (percentageDiscount / 100.0)))
        );
        productDTO.setPrice(discountedPrice);
    }
}
