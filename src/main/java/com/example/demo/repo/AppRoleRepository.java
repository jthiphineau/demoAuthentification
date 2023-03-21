package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.AppUser;

public interface AppRoleRepository extends JpaRepository<AppRoleRepository, Long> {
	AppUser findByUsername(String username);

}
