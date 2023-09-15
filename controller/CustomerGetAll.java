package com.product.controller;

import com.product.dto.Customer;
import com.product.service.CustomerService;

public class CustomerGetAll {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    Customer customer=new Customer();
	    
	    CustomerService customerService=new CustomerService();
	    customerService.getAllCustomerById(customer);
	    System.out.println("ALL GOOD");
		}
}
