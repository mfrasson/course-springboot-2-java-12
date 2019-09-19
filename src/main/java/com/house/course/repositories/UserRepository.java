package com.house.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.house.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
