package com.gaurav.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gaurav.service.CustomerServiceImpl;
import com.gaurav.service.CustomerServiceImpl2;

@Configuration
public class CustomerUtil {
	@Bean(name="customerService")
	public CustomerServiceImpl getCustomer() {
		return new CustomerServiceImpl();
	}
	
	
	
	@Bean(name="customerService2")
	public CustomerServiceImpl2 getCustomer1() {
		return new CustomerServiceImpl2();
	}
}
