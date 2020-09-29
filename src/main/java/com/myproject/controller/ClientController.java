package com.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

	@GetMapping("/test")
	public void prueba() {
		System.out.println("holaaa");
	}
	
}
