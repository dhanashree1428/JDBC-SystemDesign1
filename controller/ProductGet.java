package com.product.controller;

import com.product.dto.Product;
import com.product.service.ProductService;

public class ProductGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Product product=new Product();
 product.setId(1);
 
 ProductService productService=new ProductService();
 productService.getProductById(product);
 System.out.println("All GOOD");
	}

}
