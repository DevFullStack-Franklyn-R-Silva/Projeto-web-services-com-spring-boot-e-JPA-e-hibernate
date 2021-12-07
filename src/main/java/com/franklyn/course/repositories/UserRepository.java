package com.franklyn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franklyn.course.entities.User;

//teste resposito
@Repository 
public interface UserRepository extends JpaRepository<User, Long> {
	
}