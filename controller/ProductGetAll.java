package com.product.controller;

import com.product.dto.Product;
import com.product.service.ProductService;

public class ProductGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Product product=new Product();
    
    ProductService productService=new ProductService();
    productService.getAllProductById(product);
    System.out.println("ALL GOOD");
	}

}
