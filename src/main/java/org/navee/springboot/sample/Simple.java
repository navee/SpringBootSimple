package org.navee.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Simple {
	public static void main(String[] args) {
		SpringApplication.run(Simple.class, args);
	}
}
