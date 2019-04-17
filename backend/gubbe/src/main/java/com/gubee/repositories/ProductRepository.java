package com.gubee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gubee.domain.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
