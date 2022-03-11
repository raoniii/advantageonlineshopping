#Author: raonisferreira@gmail.com
@AdvantageShopping @produto @carrinho
Feature: Inserir produto ao carrinho

@InserirProduto
Scenario Outline: : Um produto sera adicionado ao carrinho após fazer o login.
   
  And abrir site "<userName>"
  Then clicar no botao user
  And insiro meu usuario"<username>"
  And insiro minha senha "<password>"
  Then clicar no botao signin
  When seleciona categoria
  And seleciono um produto
  And adcionar produto

	 
  
  
  Examples:
    |username|password   |
    |Test666 |Teste666   |