package com.rudrasiva86;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rudrasiva86.service.IProductService;
import com.rudrasiva86.service.ProductService;

public class Application {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IProductService productService = ctx.getBean("productService", ProductService.class);
		
		System.out.println(productService.findAll());
	}
}
