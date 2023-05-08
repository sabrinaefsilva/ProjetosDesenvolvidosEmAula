
@login
Feature: Login
Como Usuario 
Quero Realizar o login
Para acessar a conta
 
 Background: Acessar a tela de login
 Given que esteja na tela de login


  @loginPositivo
  Scenario: Login valido
    And prencher o usuario
    And preencher a senha 
    When realizar o login
    Then login realizado com sucesso
    
	@loginBlock
   Scenario: User Bloqueado
    But prencher o usuario bloqueado
    And preencher a senha 
    When realizar o login
    Then sistema apresenta mensagem de usuario bloqueado
   

   Scenario: Login com dados invalidos
    But prencher o usuario invalido
    But peencher a senha invalida
    When realizar o login
    Then sistema apresenta mensagem de usuario e senha invalida
    
    Scenario: Login com dados em branco
    But  nao prencher nenhum dado
    When realizar o login
    Then sistema apresenta mensagem de dados em branco