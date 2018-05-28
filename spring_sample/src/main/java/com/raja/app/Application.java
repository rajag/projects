package com.raja.app;

import com.raja.service.CustomerService;
import com.raja.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstname());
		System.out.println(service.findAll().get(0).getLastname());
	}

}
