Exemplo de classe facade onde há uma complexidade que no caso de uso o comprador precisa comprar o produto e tenta comprar o mesmo produto. A solução na classe que tem o design pattern de facade tem que resolver a complexidade: 
- verificar se o produto está em estoque.
- caso o produto esteja em estoque, adicionar como comprado
- efetuar o pagamento

Para implementar esse design pattern é necessário já ter um código de um sistema legado que tenha uma complexidade, assim é possível aplicar o design pattern para resolver ou "mascarar" essa complexidade chamando outro método de fachada.
Na minha opinião: é feio utilizar design pattern facade pois deixa a documentação de diagrama de classes mais difícil de ler.
A vantagem em criar um facade é expor a complexidade de chamadas de muitos comportamentos existentes. O facade apenas faz com que essa complexidade seja transferida para um método que delega essas operações complexas.

Nessa aplicação, utilizamos classes de modelo:
- Buyer: que representa o comprador dos produtos
- Payment: que representa o pagamento que deve ser feito para a compra dos produtos e está associado ao comprador
- Product: que representa o produto que o comprador quer comprar e está associado ao pagamento

Também temos classe de serviços:
- PaymentServiceImpl: que representa a complexidade de comprar o produto, pagar pelo produto e finalizar a compra do produto
- StockServiceImpl: que representa a complexidade de verificar se o produto está no estoque para poder ser comprado.

Temos classes de source code, já que não tem banco de dados:
-ProductsSource: Essa classe é um singleton que é outro design pattern muito importante, isso nos possibilita trazer os produtos cadastrados e fazer as operações de checagem de produtos em estoque e a inserção dos produtos aos items de compra do comprador.

Rode a classe Application para ver o programa funcionando com as chamadas do CheckoutFacade que descomplica as operações que são chamadas nos serviços de pagamento e estoque.

Este projeto tem o propósito didádico.
