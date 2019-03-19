package learn.springframework.controllers;

import org.springframework.stereotype.Controller;

import learn.springframework.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		return this.greetingService.sayGreeting();
	}

}
