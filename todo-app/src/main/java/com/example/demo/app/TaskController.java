package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TaskController {
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", "HelloWorld!!");
		
		return "todo/index";
	}
}
