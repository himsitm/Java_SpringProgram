package com.hs.spring.basic.springfirstprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstProgramApplication {

	public static void main(String[] args) {

		// Calling via Spring Boot way.
		// Application Context which will maintain all Beans
		ApplicationContext applicationContext = SpringApplication.run(SpringFirstProgramApplication.class, args);
		for(String beanName : applicationContext.getBeanDefinitionNames()){
			System.out.println(beanName);
		}
	}
}