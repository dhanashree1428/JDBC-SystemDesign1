package com.product.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import com.product.configuration.HelperClass;
import com.product.dto.Customer;
import com.product.dto.Product;

	public class CustomerDao {
	  HelperClass helperClass=new HelperClass();
	  Connection connection=null;
	  
	  //to save the customer data
	  public Customer saveCustomer(Customer customer) {
		 connection= helperClass.getConnection();
		 String sql="INSERT INTO customer VALUES(?,?,?)";
		 
		 PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,customer.getId());
			preparedStatement.setString(2,customer.getName());
			preparedStatement.setLong(3,customer.getCno());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
		 try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
		return customer;
	}
	  
	  //to delete the customer data
	  public boolean deleteCustomerById(int id) {
		 connection= helperClass.getConnection();
		 String sql="DELETE FROM customer WHERE ID=?";
		 int i=0;
		 PreparedStatement preparedStatement;
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,id);
			 i=preparedStatement.executeUpdate();		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
		 try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
		if(i>0) {
		return true;
	}else {
		return false;
	}
	  }
	  
	  //to update customer
	  public Customer updateCustomerById(Customer customer) {
			 connection= helperClass.getConnection();
			 String sql="UPDATE customer SET name=?,cno=? WHERE ID=?";
			 
			 PreparedStatement preparedStatement;
			
			try {
				preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setString(1,customer.getName());
				preparedStatement.setDouble(2,customer.getCno());
				preparedStatement.setInt(3,customer.getId());
				int i=preparedStatement.executeUpdate();		
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 finally {
			 try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
			return customer;
		  }

	//to get the customer 
	  public Customer getCustomerById(Customer customer) {
			 connection= helperClass.getConnection();
			 String sql="SELECT *FROM customer WHERE ID=?";
			 
			 PreparedStatement preparedStatement;
			
			try {
				preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setInt(1,customer.getId());
						
				ResultSet resultSet=preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getLong(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 finally {
			 try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
			return customer;
		  }
	  
	//to getAll the customer 
	  public Customer getAllCustomerById(Customer customer) {
			 connection= helperClass.getConnection();
			 String sql="SELECT *FROM customer";
			 
			 PreparedStatement preparedStatement;
			
			try {
				preparedStatement = connection.prepareStatement(sql);
						
				ResultSet resultSet=preparedStatement.executeQuery();
				
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getLong(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 finally {
			 try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
			return customer;
		  }
	}



