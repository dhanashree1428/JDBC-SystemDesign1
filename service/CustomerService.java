package com.product.service;

import com.product.dao.CustomerDao;
import com.product.dto.Customer;

public class CustomerService {
	CustomerDao customerDao=new CustomerDao();
	
	 public Customer saveCustomer(Customer customer) {
	 return customerDao.saveCustomer(customer);
	 }
	  public boolean deleteCustomerById(int id) {
	  return customerDao.deleteCustomerById(id);
	  } 
	  public Customer updateCustomerById(Customer customer) {
		return  customerDao.updateCustomerById(customer);
	  }
	  public Customer getCustomerById(Customer customer) {
	 return customerDao.getCustomerById(customer);
	  }
	  public Customer getAllCustomerById(Customer customer) {
	return customerDao.getAllCustomerById(customer);
	  }
	  }
	 

