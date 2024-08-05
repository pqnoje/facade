Exemplo de classe facade onde há uma complexidade que no caso de uso o comprador precisa comprar o produto e tenta comprar o mesmo produto. A solução na classe que tem o design pattern de facade tem que resolver a complexidade: 
- verificar se o produto está em estoque.
- caso o produto esteja em estoque, adicionar como comprado
- efetuar o pagamento

Para implementar esse design pattern é necessário já ter um código de um sistema legado que tenha uma complexidade, assim é possível aplicar o design pattern para resolver ou "mascarar" essa complexidade chamando outro método de fachada.
Na minha opinião: é feio utilizar design pattern facade pois deixa a documentação de diagrama de classes mais difícil de ler.
A vantagem em criar um facade é expor a complexidade de chamadas de muitos comportamentos existentes. O facade apenas faz com que essa complexidade seja transferida para um método que delega essas operações complexas.
