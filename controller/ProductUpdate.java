package com.product.controller;

import com.product.dto.Product;
import com.product.service.ProductService;

public class ProductUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Product product=new Product();
    product.setId(1);
    product.setName("abc");
    product.setPrice(50);
    
    ProductService productService=new ProductService();
    Product p=productService.updateProductById(product);
    if(p!=null) {
    	System.out.println(p.getId()+" updated Successfully...");
    }
	}

}
