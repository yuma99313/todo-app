package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class todoController {
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", "HelloWorld!!");
		
		return "todo/index";
	}
}
