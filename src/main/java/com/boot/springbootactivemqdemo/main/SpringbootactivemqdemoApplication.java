package com.boot.springbootactivemqdemo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.boot.springbootactivemqdemo")
@EnableScheduling
public class SpringbootactivemqdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootactivemqdemoApplication.class, args);
	}

}
