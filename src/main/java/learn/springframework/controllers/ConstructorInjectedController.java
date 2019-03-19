package learn.springframework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import learn.springframework.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return this.greetingService.sayGreeting();
	}

}