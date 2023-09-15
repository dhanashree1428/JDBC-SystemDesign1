package com.product.controller;

import com.product.service.ProductService;

public class ProductDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  ProductService productService=new ProductService();
  boolean res=productService.deleteProductById(1);
  System.out.println(res);
	}

}
