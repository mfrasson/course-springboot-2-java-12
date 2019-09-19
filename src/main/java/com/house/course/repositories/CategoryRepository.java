package com.house.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.house.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
