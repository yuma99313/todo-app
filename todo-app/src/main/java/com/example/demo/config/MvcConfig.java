package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/").setViewName("users/index");
	    registry.addViewController("/hello").setViewName("hello");
	    registry.addViewController("/login").setViewName("users/login");
	  }
}
