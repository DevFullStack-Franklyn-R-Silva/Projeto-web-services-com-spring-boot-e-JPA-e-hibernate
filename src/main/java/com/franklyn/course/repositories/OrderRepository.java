package com.franklyn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franklyn.course.entities.Order;

@Repository 
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
