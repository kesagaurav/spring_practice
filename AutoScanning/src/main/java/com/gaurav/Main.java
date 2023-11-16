package com.gaurav;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.gaurav.service.CustomerService;
import com.gaurav.service.CustomerServiceImpl;
import com.gaurav.util.CustomerUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(CustomerUtil.class);
		CustomerService service=null;
		service=(CustomerServiceImpl) context.getBean(CustomerServiceImpl.class,"customerService");
		System.out.println(service.getCustomer());
		
//		service=(CustomerServiceImpl2) context.getBean(CustomerServiceImpl2.class,"customerService2");
//		System.out.println(service.getCustomer());
		
		context.close();
	}

}
