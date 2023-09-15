package com.product.controller;

import com.product.dto.Customer;
import com.product.service.CustomerService;

public class CustomerSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setId(1);
		customer.setName("abc");
		customer.setCno(1234567890);
		
		CustomerService customerservice=new CustomerService();
		Customer c=customerservice.saveCustomer(customer);
				if(c!=null) {
			System.out.println(c.getId() +" saved Succesfully...");
		}
	}

}
