#language: pt
#encoding: utf-8

@test
Funcionalidade: Realizar Compra no E-commerce

	Como um comprador
	Quero ver a lista de produtos disponiveis
	Para que eu possa escolher qual devo comprar
		
  Cenario: Adicionar produto ao carrinho
  	Dado que um usuario acessa o site "http://automationpractice.com"
  	E pesquisa pelo produto "Blouse"
    E adiciona o produto "Blouse" ao carrinho
	E acessa o checkout
	E realiza login "bdd@desafioeveris.com" e senha "bdddesafio"
	E Confirma endereço de entrega
	E escolhe a forma de transporte
	E pagamento for confirmado
	E deve ser apresentado a mensagem Your order on My Store is complete.


  		


