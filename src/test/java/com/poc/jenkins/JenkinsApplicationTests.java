package com.poc.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsApplicationTests {

	public static Logger log= LoggerFactory.getLogger(JenkinsApplicationTests.class);

	@Test
	public void contextLoads() {
		log.info("Test case executed.....");
		Assertions.assertTrue(true);
	}

}
