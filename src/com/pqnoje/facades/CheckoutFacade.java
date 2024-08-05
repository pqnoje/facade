package com.pqnoje.facades;

import com.pqnoje.models.Buyer;
import com.pqnoje.models.Product;
import com.pqnoje.services.PaymentServiceImpl;
import com.pqnoje.services.StockServiceImpl;

public class CheckoutFacade {

    private static PaymentServiceImpl paymentService;
	private static StockServiceImpl stockService;

    public static void checkoutPayment(Product product, Buyer buyer) {
        System.out.println("O comprador " + buyer.getName() + " quer comprar o item " + product.getName() + " que custa " + product.getPrice());

        System.out.println("Iniciando serviço de compra e pagamento.");
		paymentService = new PaymentServiceImpl();

		System.out.println("Iniciando serviço de estoque.");
		stockService = new StockServiceImpl();

        System.out.println("Checando se o produto " + product.getName() + " está disponível em estoque.");
		boolean isProductInStock = stockService.checkProductInStock(product);
		System.out.println("O produto está disponível? " + isProductInStock);
		if (isProductInStock) {
			paymentService.buy(buyer.getPayment(), product);
			paymentService.pay(buyer.getPayment());
		} else {
			System.out.println("O produto não está em estoque.");
		}
		
		System.out.println("O pagamento foi efetuado? " + paymentService.checkout(buyer));
    }
}
