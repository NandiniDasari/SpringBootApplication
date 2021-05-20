package net.javaguides.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {
	@RequestMapping("/hello")
	public String sayHello() {
		return "<html>"+"<head>"+"<title>"+"Welcome"+"</title>"+"</head>"
	+"<body>"+"<h1>"+"HelloWorld"+"</h1>"+"</body>"+"</html>";
	}

}
