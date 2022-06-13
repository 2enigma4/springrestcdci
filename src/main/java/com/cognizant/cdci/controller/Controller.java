package com.cognizant.cdci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/username/{name}")
	public String getName(@PathVariable("name") String name) {
		return "Hello "+name;
	}
	
	@GetMapping("/check")
	public String check() {
		return "1...2...3...check";
	}
	
}
