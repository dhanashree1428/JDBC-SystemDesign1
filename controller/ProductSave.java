package com.product.controller;

import com.product.service.ProductService;
import com.product.dto.Product;

public class ProductSave {
public static void main(String[] args) {
	Product product=new Product();
	product.setId(1);
	product.setName("Cadbury");
	product.setPrice(150);
	
	ProductService productService=new ProductService();
	Product p=productService.saveProduct(product);
			if(p!=null) {
		System.out.println(p.getId() +" saved Succesfully...");
	}
}
}
