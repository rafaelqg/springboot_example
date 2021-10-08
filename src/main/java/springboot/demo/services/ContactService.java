package springboot.demo.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactService {

	@RequestMapping("/contact")
	String list() {
		return "Hello World - Spring boot project! - GET";
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	String add() {
		return "Hello World - Spring boot project! - POST Method";
	}
	
}