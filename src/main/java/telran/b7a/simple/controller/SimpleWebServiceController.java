package telran.b7a.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleWebServiceController {
	
	@GetMapping("/hello")
	public String hello(@RequestParam String name) {
		return "Hello " + name;
	}

}