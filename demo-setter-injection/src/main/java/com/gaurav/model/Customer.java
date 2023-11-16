package com.gaurav.model;

import org.springframework.stereotype.Component;

import com.gaurav.service.PlanService;
@Component //general purpose annotation
public class Customer {

	private PlanService plan;
	private String customerName;
	private int age;

	public void setPlan(PlanService plan) {
		this.plan = plan;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String registerCustomer(String name) {
		return "Welcome " + name + "! You are now our registered user!!";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String voterAge(int age) {
		if (age >= 18) {
			return "your's is " + age + " is eligible to vote ";
		} else {
			return "your's is   " + age + " is not eligible to vote ";
		}
	}

	public void register() {
		if (plan.enrolledPlan()) {
			System.out.println("customer enrolled successfuly");
		} else {
			System.out.println("customer not registered");
		}
	}

}
