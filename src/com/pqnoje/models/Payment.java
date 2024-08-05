package com.pqnoje.models;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private boolean paid;
    private List<Product> products;
    private Double value;

    public boolean isPaid() {
        return paid;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public Payment() {
        this.products = new ArrayList<Product>();
        this.value = 0.0;
    }

    
}
