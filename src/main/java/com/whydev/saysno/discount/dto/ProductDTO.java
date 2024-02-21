package com.whydev.saysno.discount.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductDTO {
    private Long id;
    private String product;
    private String category;
    private int price;

    public static ProductDTO toProductDTO(ProductEntity productEntity){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(productEntity.getId());
        productDTO.setProduct(productEntity.getProduct());
        productDTO.setCategory(productEntity.getCategory());
        productDTO.setPrice(productEntity.getPrice());

        return productDTO;
    }
}
