package com.gaurav.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gaurav.repository.CustomerRepository;
import com.gaurav.service.CustomerServiceImpl;

@Configuration
public class SpringConfiguration {

	@Bean
	public CustomerServiceImpl customerService() {
		return new CustomerServiceImpl(100,customerRepository());
	}
	
	
	@Bean
	public CustomerRepository customerRepository() {
		return new CustomerRepository();
	}
}
