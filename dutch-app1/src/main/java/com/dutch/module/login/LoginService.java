package com.dutch.module.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	@Autowired
public LoginDao dao;
	public LoginResult LoginService(String email,String password,int roll) {
		
		return dao.login(email, password,roll);
		
	}
	
}
