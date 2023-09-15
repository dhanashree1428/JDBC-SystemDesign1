package com.product.controller;

import com.product.dto.Customer;
import com.product.service.CustomerService;

public class CustomerUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Customer customer=new Customer();
		    customer.setId(1);
		    customer.setName("xyz");
		    customer.setCno(1234567891);
		    
		    CustomerService customerService=new CustomerService();
		    Customer c=customerService.updateCustomerById(customer);
		    if(c!=null) {
		    	System.out.println(c.getId()+" updated Successfully...");
		    }
	}

}
