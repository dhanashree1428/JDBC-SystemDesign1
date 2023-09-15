package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.configuration.HelperClass;
import com.product.dto.Product;

public class ProductDao {
  HelperClass helperClass=new HelperClass();
  Connection connection=null;
  
  //to save the product data
  public Product saveProduct(Product product) {
	 connection= helperClass.getConnection();
	 String sql="INSERT INTO product VALUES(?,?,?)";
	 
	 PreparedStatement preparedStatement;
	try {
		preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setInt(1,product.getId());
		preparedStatement.setString(2,product.getName());
		preparedStatement.setDouble(3,product.getPrice());
		
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
	return product;
}
  
  //to delete the product data
  public boolean deleteProductById(int id) {
	 connection= helperClass.getConnection();
	 String sql="DELETE FROM product WHERE ID=?";
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
  
  //to update product 
  public Product updateProductById(Product product) {
		 connection= helperClass.getConnection();
		 String sql="UPDATE product SET name=?,price=? WHERE ID=?";
		 
		 PreparedStatement preparedStatement;
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,product.getName());
			preparedStatement.setDouble(2,product.getPrice());
			preparedStatement.setInt(3,product.getId());
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
		return product;
	  }

//to get the product 
  public Product getProductById(Product product) {
		 connection= helperClass.getConnection();
		 String sql="SELECT *FROM product WHERE ID=?";
		 
		 PreparedStatement preparedStatement;
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,product.getId());
					
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getDouble(3));
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
		return product;
	  }
  
//to getAll the product 
  public Product getAllProductById(Product product) {
		 connection= helperClass.getConnection();
		 String sql="SELECT *FROM product";
		 
		 PreparedStatement preparedStatement;
		
		try {
			preparedStatement = connection.prepareStatement(sql);
					
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getDouble(3));
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
		return product;
	  }
}

