package com.gaurav.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gaurav.repository.CustomerRepository;
import com.gaurav.service.CustomerServiceImpl;

@Configuration
public class SpringConfiguration {

	@Bean
	public CustomerRepository customerRepository() {
		return new CustomerRepository();
	}
	
	
	
	@Bean
	public CustomerServiceImpl customerService() {
		CustomerServiceImpl service=new CustomerServiceImpl();
		service.setCount(110);
		service.setRepo(customerRepository());
		service.setName("gaurav!!!");
		return service;
	}
}
