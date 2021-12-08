package com.franklyn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franklyn.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
