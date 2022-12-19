package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserContoroller {
	@GetMapping("/login")
    public String getSignUp(Model model) {
        return "/user/login";
    }
	
	@PostMapping("/login")
	public String postSignUp(Model model) {
		model.addAttribute("message", "HelloWorld!!");
		return "todo/index";
	}
}
