package org.navee.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SimpleApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args){
		SpringApplication.run(SimpleApplication.class, args);
	}
}
