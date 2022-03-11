#Author: raonisferreira@gmail.com

@AdvantageShopping @Cadastro @Register
Feature: deve Clicar no icone de login entao clicar no link de cadastrar nova conta e inserir os dados

@Register
Scenario Outline: Deve direcionar a uma pagina de cadastro de usuario assim que clicar em create new account
 
  And inserir usuario "<user>"
  And inserir Email "<email>"
  And inserir senha "<password>"
  And insesir confirmacao da senha "<confirmPassword>"
  And insesir primeiro nome "<firstName>"
  And insesir sobrenome "<lastName>"
  And insesir telefone "<phoneNumber>"
  And selecionar pais "<country>"
  And insesir Cidade "<city>"
  And insesir Endereco "<address>"
  And insesir Estado "<state>"
  And insesir CEP "<postalCode>"
  And clicar em condicoes de privacidade do site
  Then clicar no botao registro "<user>"
   
   Examples:
    |user    |email          |password|confirmPassword|firstName|lastName|phoneNumber|country|city|address |state|postalCode|
    |Test666 |t1111@gmail.com|Teste666|Teste666       |Teste4   |Etset   |1199219912 |Brazil |City |Rua Rua|SP   |08123123  |