package com.example.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration config;
	@GetMapping("/limits")
	public LimitConfiguration limtConfiguration() {
		return new LimitConfiguration(config.getMin(),config.getMax());
	}

}
