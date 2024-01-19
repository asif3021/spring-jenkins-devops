package com.springjenking.springjenkingdevops;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDevopsApplication {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinsDevopsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinsDevopsApplication.class, args);
	}

}
