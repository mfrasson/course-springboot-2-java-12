package com.house.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.house.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
