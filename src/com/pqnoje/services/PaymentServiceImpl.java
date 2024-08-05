package com.pqnoje.services;

import com.pqnoje.models.Buyer;
import com.pqnoje.models.Payment;
import com.pqnoje.models.Product;
import com.pqnoje.source.ProductsSource;

public class PaymentServiceImpl {

    public boolean checkout(Buyer buyer) {
        boolean isPaid = buyer.getPayment().isPaid();
        buyer.setOwnedProducts(buyer.getPayment().getProducts());
        buyer.setPayment(new Payment());
        return isPaid;
    }

    public void buy(Payment payment, Product product) {
        payment.getProducts().add(product);
        payment.setValue(payment.getValue() + product.getPrice());
        int indexOfProduct = ProductsSource.getInstance().getProducts().indexOf(product);
        ProductsSource.getInstance().getProducts().remove(indexOfProduct);
    }

    public void pay(Payment payment) {
        payment.setPaid(true);
    }
}
