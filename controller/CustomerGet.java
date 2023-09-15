package com.product.controller;

import com.product.dto.Customer;
import com.product.service.CustomerService;


public class CustomerGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Customer customer=new Customer();
		 customer.setId(1);
		 
		 CustomerService customerService=new CustomerService();
		 customerService.getCustomerById(customer);
		 System.out.println("All GOOD");
			}
	}


