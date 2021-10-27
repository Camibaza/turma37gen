package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")

public class Hello2 {
	@GetMapping
	public String hello2() {
		return "Meu objetivo de aprendizagem essa semana é aprender Springboot.";
		
	}

}
