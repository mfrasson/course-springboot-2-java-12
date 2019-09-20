package com.house.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.house.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
