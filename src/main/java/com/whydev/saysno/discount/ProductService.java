package com.whydev.saysno.discount;

import com.whydev.saysno.discount.dto.ProductDTO;
import com.whydev.saysno.discount.repository.ProductRepository;
import com.whydev.saysno.discount.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void save(ProductDTO productDTO) {
        ProductEntity productEntity = ProductEntity.toProductEntity(productDTO);
        productRepository.save(productEntity);
    }

    public List<ProductDTO> findAll() {
        List<ProductEntity> productEntityList = productRepository.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();
        for (ProductEntity productEntity : productEntityList){
            productDTOList.add(ProductDTO.toProductDTO(productEntity));
        }
        return productDTOList;

    }
}
