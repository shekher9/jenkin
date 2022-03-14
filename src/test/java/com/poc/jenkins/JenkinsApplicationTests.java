package com.poc.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	public static Logger log= LoggerFactory.getLogger(JenkinsApplicationTests.class);

	@Test
	public void contextLoads() {
		log.info("Test case executed.....");
	}

}
