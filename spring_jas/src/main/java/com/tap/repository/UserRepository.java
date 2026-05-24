package com.tap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
