package com.rudra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rudra.service.IProductService;
import com.rudra.service.ProductService;

public class Application {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IProductService productService = ctx.getBean("productService", ProductService.class);
		
		System.out.println(productService.findAll());
	}
}
