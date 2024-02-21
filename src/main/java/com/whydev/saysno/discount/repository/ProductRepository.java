package com.whydev.saysno.discount.repository;

import com.whydev.saysno.discount.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    @Override
    ArrayList<ProductEntity> findAll();

}