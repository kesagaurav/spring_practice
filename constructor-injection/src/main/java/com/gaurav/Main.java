package com.gaurav;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.gaurav.repository.CustomerRepository;
import com.gaurav.service.CustomerServiceImpl;
import com.gaurav.util.SpringConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext aps=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		CustomerServiceImpl service=null;
		service=(CustomerServiceImpl) aps.getBean("customerService");
		System.out.println(service.fetchCustomer());
		
		
		
		
		
		AbstractApplicationContext aps1=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		CustomerRepository repo=null;
		repo=(CustomerRepository) aps1.getBean("customerRepository");
		System.out.println(repo.fetchCustomer(150));
	}

}
