package com.whydev.saysno.discount.repository;

import com.whydev.saysno.discount.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}