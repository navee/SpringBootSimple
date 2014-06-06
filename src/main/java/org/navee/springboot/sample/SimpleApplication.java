package org.navee.springboot.sample;


import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SimpleApplication{
	public static void main(String[] args){
		SpringApplication.run(SimpleApplication.class, args);
	}
	
	/**
	 * 配置 characterEncodingFilter
	 * @param context
	 * @return
	 */
	@Bean
	public Filter characterEncodingFilter(ApplicationContext context) {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);
		
		return encodingFilter;
	}
}
