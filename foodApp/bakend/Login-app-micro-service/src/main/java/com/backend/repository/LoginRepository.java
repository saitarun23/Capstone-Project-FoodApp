package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

}
