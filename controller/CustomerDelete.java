package com.product.controller;

import com.product.service.CustomerService;


public class CustomerDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService=new CustomerService();
		  boolean res=customerService.deleteCustomerById(1);
		  System.out.println(res);
	}

}
