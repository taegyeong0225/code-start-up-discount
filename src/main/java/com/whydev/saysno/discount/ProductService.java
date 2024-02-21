package com.whydev.saysno.discount;

import com.whydev.saysno.discount.dto.ProductDTO;
import com.whydev.saysno.discount.repository.ProductRepository;
import com.whydev.saysno.discount.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service //스프링이 관리해주는 객체 == 스프링 빈
@RequiredArgsConstructor //controller와 같이. final 멤버변수 생성자 만드는 역할
public class ProductService {

    private final ProductRepository productRepository; // 먼저 jpa, mysql dependency 추가

    public void save(ProductDTO productDTO) {
        // repsitory의 save 메서드 호출
        ProductEntity productEntity = ProductEntity.toProductEntity(productDTO);
        productRepository.save(productEntity);
        //Repository의 save메서드 호출 (조건. entity객체를 넘겨줘야 함)

    }
}
