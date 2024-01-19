package com.springjenking.springjenkingdevops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDevopsApplicationTests {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinsDevopsApplicationTests.class);

	@Test
	void contextLoads() {

		logger.info("Test case executing...");
		Assertions.assertTrue(true);
	}

}
