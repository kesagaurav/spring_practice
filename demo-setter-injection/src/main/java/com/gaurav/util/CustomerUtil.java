package com.gaurav.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gaurav.model.Customer;
import com.gaurav.service.CustomerServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.gaurav.model")
public class CustomerUtil {
//	@Bean(name = "customerService")
//	public CustomerServiceImpl getCustomerImpl() {
//		return new CustomerServiceImpl();
//	}
//	
//	@Bean(name="customer")
//	public Customer customer() {
//		return new Customer();
//	}

}
