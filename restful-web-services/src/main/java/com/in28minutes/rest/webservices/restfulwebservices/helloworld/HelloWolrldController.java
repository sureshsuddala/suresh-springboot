package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWolrldController {
	
	@GetMapping(path="/users")
	public String helloWorld() {
		return "hello world";
	}
	
	@GetMapping(path="/user")
	public HelloWorldBean helloWorldBean() {
		return  new HelloWorldBean("hello world suresh");
	}
	
	@GetMapping(path="/user/path/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return  new HelloWorldBean(String.format("hello world suresh  %s",name));
	}

}
