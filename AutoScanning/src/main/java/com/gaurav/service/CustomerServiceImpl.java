package com.gaurav.service;

import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	public String getCustomer() {
		// TODO Auto-generated method stub
		return "customer is registered successfully";
	}

}
