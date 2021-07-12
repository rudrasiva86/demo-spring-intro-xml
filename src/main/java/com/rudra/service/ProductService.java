package com.rudra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rudra.model.Product;
import com.rudra.repository.IProductRepository;

@Service
public class ProductService implements IProductService {
	
	@Autowired
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
