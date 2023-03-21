package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.AppRole;
import com.example.demo.entities.AppUser;
import com.example.demo.repo.AppRoleRepository;
import com.example.demo.repo.AppUserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AppUserRepository appUserRepository;
	
	@Autowired
	private AppRoleRepository appRoleRepository;


	@Override
	public AppUser addNewUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return appUserRepository.save(appUser);
	}

	@Override
	public AppRole addNewRole(AppRole appRole) {
		// TODO Auto-generated method stub
		return appRoleRepository.save(appRole);
	}

	@Override
	public void addRoleToUser(String userName, String roleName) {
		AppUser foundUser = appUserRepository.findByUserName(userName);
		AppRole foundRole = appRoleRepository.findByRoleName(roleName);
		foundUser.getAppRoles().add(foundRole); 
		
	}
	
}
 