package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//	    http
//	      .authorizeRequests()
//	        .antMatchers("/todo/index").permitAll()
//	        .anyRequest().authenticated()
//	        .and()
//	      .formLogin()
//	        .loginPage("/user/login")
//	        .permitAll()
//	        .and()
//	      .logout()
//	        .permitAll();
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//	    String password = passwordEncoder().encode("password");
//	
//	    auth.inMemoryAuthentication()
//	    .passwordEncoder(passwordEncoder())
//	    .withUser("user").password(password).roles("USER");
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//      return new BCryptPasswordEncoder();
//	}
}
