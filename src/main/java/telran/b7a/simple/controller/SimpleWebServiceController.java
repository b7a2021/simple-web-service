package telran.b7a.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import telran.b7a.simple.dto.PersonDto;
import telran.b7a.simple.dto.PersonFoodDto;

@RestController
public class SimpleWebServiceController {
	
	@GetMapping("/hello")
	public String hello(@RequestParam String name) {
		return "Hello " + name;
	}
	
	@PostMapping("/hello")
	public String bye(@RequestParam String name) {
		return name + " bye, bye!";
	}
	
	@PostMapping("/person")
	public String greetingPerson(@RequestBody PersonDto personDto) {
		return "Hello " + personDto.getFirstName() + " " + personDto.getLastName();
	}
	
	@PostMapping("/feed")
	public PersonFoodDto feedPersons(@RequestBody PersonDto personDto) {
		return PersonFoodDto.builder()
								.fullName(personDto.getFirstName() + " " + personDto.getLastName())
								.food("candy")
								.food("banana")
								.food("clementine")
								.build();
	}

}
