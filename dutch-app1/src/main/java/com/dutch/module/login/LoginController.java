package com.dutch.module.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
       @Autowired
	public LoginService service;
       
       @RequestMapping(value="login",method=RequestMethod.GET)
       public String login(@RequestParam("email")  String email,@RequestParam("password") String password,@RequestParam("roll") int roll) {
    	 String msg="";
    	 System.out.println("hi controller...");
    	   LoginResult result= service.LoginService(email, password,roll);
    	  if(result==null) {
    		  msg="login not successful";
    	  }else {
    		  msg="login  successful"; 
    	  }
		return msg;
    	   
       }
}
