package com.product.service;

import com.product.dao.ProductDao;
import com.product.dto.Product;

public class ProductService {
	
	ProductDao productDao=new ProductDao();
	
	 public Product saveProduct(Product product) {
		return productDao.saveProduct(product);
		}
	 public boolean deleteProductById(int id) {
		return productDao.deleteProductById(1);
	 }
	 public Product updateProductById(Product product) {
		 return productDao.updateProductById(product);
	 }
	 public Product getProductById(Product product) {
		return  productDao.getProductById(product);
	 }
	 public Product getAllProductById(Product product) {
	    return productDao.getAllProductById(product);
	 }
	 }
