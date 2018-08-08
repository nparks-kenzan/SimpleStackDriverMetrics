package com.kenzan.examples.stackdriver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StkdrvexmpleApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(StkdrvexmpleApplication.class);	


	public static void main(String[] args) {
		SpringApplication.run(StkdrvexmpleApplication.class, args);
		logger.debug("--Application Started--");

	}
}
