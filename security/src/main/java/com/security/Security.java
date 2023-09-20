package com.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter{
	
	
	public void configure(AuthenticationManagerBuilder autu) throws Exception {
		autu.inMemoryAuthentication().withUser("admin").password("$2a$12$6J.dsNek98jNdIgnmxZd/.YmIFF4zn1ozWcwhQjNlKrtyW1/Da7ra").roles("student");
	}
	@Bean
	public  PasswordEncoder getByCryptedPass() {
		return new BCryptPasswordEncoder(12);
	}
	

}
