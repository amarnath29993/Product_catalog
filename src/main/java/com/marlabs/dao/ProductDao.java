package com.marlabs.dao;

import java.util.List;

import com.marlabs.model.Product;

public interface ProductDao {
	public Product addCategory(Product product);

	public Product updateCategory(Product product);

	public Product getProductById(Integer id);

	public Product deleteProductById(Integer id);

	public List<Product> getAllProducts();

}
