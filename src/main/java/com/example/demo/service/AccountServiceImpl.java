package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.AppRole;
import com.example.demo.entities.AppUser;
import com.example.demo.repo.AppUserRepository;

public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AppUserRepository appUserRepository;

	@Override
	public AppUser addNewUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppRole addNewRole(AppRole appRole) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRoleToUser(String userName, String roleName) {
		// TODO Auto-generated method stub
		
	}
	
}
 