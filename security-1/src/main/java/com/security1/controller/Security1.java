package com.security1.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class Security1 extends WebSecurityConfigurerAdapter {

	public void configure(AuthenticationManagerBuilder autu) throws Exception {
		// autu.inMemoryAuthentication().withUser("admin").password("$2y$10$xy327TpTvTxc2KHzgtoxc.VLVYYLlf/771HdHob10X4pVGdHku/x.").roles("student");
		autu.inMemoryAuthentication().withUser("Kamal")
				.password("$2a$12$/tf4nYNYXVu8W8bCGP/MMefKApQByBvcVPZMk/rHRJNR/IgJdOfki").roles("trainee").and()
				.withUser("deva").password("$2a$12$TjfiDYixKLKrndEweLSGe.popfOWLp0rprAfJb/5TK2BCoT3GbQB6")
				.roles("manager").and().withUser("prabu")
				.password("$2a$12$PXAaDS7x9.57J0vu6SMEZO8VDblVCpiH/V73AikKS98eY6RWh0w5u").roles("student").and();
	}

	public void Configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/Trainee").hasAnyRole("trainer", "manager");
		http.authorizeRequests().antMatchers("/Manager").hasRole("manager");
		http.authorizeRequests().antMatchers("/Student").permitAll();
	}

	@Bean
	public PasswordEncoder getByCryptedPass() {
		return new BCryptPasswordEncoder(12);

	}
}

