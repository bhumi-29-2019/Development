package com.luv2code.springboot.demo.mycoolapp.mycontroller.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello World ! Yime Server is on "+LocalDateTime.now();
		
	}
	
	//expose a new point for workout
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run hard 5k"+LocalDateTime.now();
		
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "daily fortune "+LocalDateTime.now();
		
	}
	
	
	@GetMapping("/love")
	public String getDailylove() {
		return "daily love "+LocalDateTime.now();
		
	}

}
