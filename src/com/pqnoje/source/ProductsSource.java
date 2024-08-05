package com.pqnoje.source;

import java.util.ArrayList;
import java.util.List;

import com.pqnoje.models.Product;

public class ProductsSource {

    private List<Product> products = new ArrayList<Product>();

    private static ProductsSource instance;

    private ProductsSource() {
        this.products.add(new Product("Calça", 90.00));
        this.products.add(new Product("Camisa", 70.00));
        this.products.add(new Product("Shorts", 50.00));
        this.products.add(new Product("Sandália", 30.00));
        this.products.add(new Product("Vestido", 80.00));
        this.products.add(new Product("Tênis", 120.00));
        this.products.add(new Product("Moletom", 110.00));
        this.products.add(new Product("Cachecol", 25.00));
        this.products.add(new Product("Boné", 35.00));
        this.products.add(new Product("Touca", 15.00));
    }

    public static ProductsSource getInstance() {
        if (instance == null) {
            instance = new ProductsSource();
        }
        return instance;
    }

    public List<Product> getProducts() {
        return products;
    }
}
