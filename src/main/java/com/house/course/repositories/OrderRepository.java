package com.house.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.house.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
