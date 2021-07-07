package com.rudrasiva86.service;

import java.util.List;

import com.rudrasiva86.model.Product;
import com.rudrasiva86.repository.IProductRepository;

public class ProductService implements IProductService {
	
	private IProductRepository productRepository;

	public ProductService() {
		System.out.println("Product Service default constructor");
	}
	
	public ProductService(IProductRepository productRepository) {
		System.out.println("Product Service repository constructor");
		this.productRepository = productRepository;
	}

	public void setProductRepository(IProductRepository productRepository) {
		System.out.println("Product Service setter method");
		this.productRepository = productRepository;
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

}
