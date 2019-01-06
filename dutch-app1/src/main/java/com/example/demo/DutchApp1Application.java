package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.dutch.module.login.LoginController;
import com.dutch.module.login.LoginDao;
import com.dutch.module.login.LoginService;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@Import({LoginController.class,LoginService.class,LoginDao.class})
public class DutchApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(DutchApp1Application.class, args);
	}
}
