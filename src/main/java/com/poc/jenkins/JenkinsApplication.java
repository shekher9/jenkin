package com.poc.jenkins;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class JenkinsApplication {

	public static Logger logger= LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Stared.....");
	}

	public static void main(String[] args) {
		logger.info("application executed....");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
