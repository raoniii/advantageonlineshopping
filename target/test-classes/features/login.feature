#Author: raonisferreira@gmail.com
@AdvantageShopping @Entrar @Login
Feature: Fazer login como um usuario ainda não logado


@Login
Scenario Outline: : Deve mostrar um modal de login ao clicar no icone e apos a insercao de dados efetuar o login
  
  And abrir site "<userName>"
  Then clicar no botao user
  And insiro meu usuario"<username>"
  And insiro minha senha "<password>"
  Then clicar no botao signin
  
  
  
  Examples:
    |username|password   |
    |Test111 |Teste666   |