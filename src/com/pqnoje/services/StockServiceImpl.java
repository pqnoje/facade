package com.pqnoje.services;

import com.pqnoje.models.Product;
import com.pqnoje.source.ProductsSource;

public class StockServiceImpl {
	public boolean checkProductInStock(Product product) {
		boolean hasProduct = ProductsSource.getInstance().getProducts().stream().anyMatch(item -> item == product);
		return hasProduct;
	}
}
