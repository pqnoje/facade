package com.pqnoje.application;

import java.util.List;

import com.pqnoje.facades.CheckoutFacade;
import com.pqnoje.models.Buyer;
import com.pqnoje.models.Product;
import com.pqnoje.source.ProductsSource;

public class Application {

	private static Buyer buyer;

	private static List<Product> products = ProductsSource.getInstance().getProducts();

	public static void main(String[] args) {
		System.out.println("Novo Comprador: ");
		buyer = new Buyer("Jefferson");
		System.out.println(buyer.getName());
		
		System.out.println("Lista de Produtos: ");

		System.out.println(products);

		Product productToBuy = products.get(0);
		
		CheckoutFacade.checkoutPayment(productToBuy, buyer);

		CheckoutFacade.checkoutPayment(productToBuy, buyer);

		Product productToBuy2 = products.get(1);

		CheckoutFacade.checkoutPayment(productToBuy2, buyer);
	}

}
