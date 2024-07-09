package com.polus.servicerequest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polus.servicerequest.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	User findByEmail(String email);
}
