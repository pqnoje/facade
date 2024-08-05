package com.pqnoje.models;

import java.util.ArrayList;
import java.util.List;

public class Buyer {

    private String name;
    private Payment payment;
    private List<Product> ownedProducts;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public List<Product> getOwnedProducts() {
        return ownedProducts;
    }
    public void setOwnedProducts(List<Product> ownedProducts) {
        this.ownedProducts = ownedProducts;
    }
    public Buyer(String name) {
        this.name = name;
        this.payment = new Payment();
        this.ownedProducts = new ArrayList<Product>();
    }
}
