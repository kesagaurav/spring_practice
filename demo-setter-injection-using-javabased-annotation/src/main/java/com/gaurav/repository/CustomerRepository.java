package com.gaurav.repository;

public class CustomerRepository {

	public String fetchCustomer(int count) {
		return " The no of customers fetched are : " + count;
	}
	
	
	public String createCustomer() {
		return "Customer is successfully created";
	}
	
	
	public String name(String name) {
		return "the name is : " + name;
	}
}
