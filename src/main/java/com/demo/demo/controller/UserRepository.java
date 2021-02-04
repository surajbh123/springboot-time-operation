package com.demo.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
