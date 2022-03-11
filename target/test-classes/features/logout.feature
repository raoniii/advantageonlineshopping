#Author: raonisferreira@gmail.com
@AdvantageShopping @Sair @Logout
Feature: Fazer logout como um usuario 


@Logout
Scenario Outline: : Deve realizar o login e em seguida o logout
  
  And abrir site "<userName>"
  Then clicar no botao user
  And insiro meu usuario"<username>"
  And insiro minha senha "<password>"
  Then clicar no botao signin
  And Clico para sair
  And clico em SignOut
  Then Valido se a conta foi deslogada
  
  
  
  Examples:
    |username|password   |
    |Test666 |Teste666   |