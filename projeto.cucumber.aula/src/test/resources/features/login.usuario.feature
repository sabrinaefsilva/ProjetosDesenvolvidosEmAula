
@teste
Feature: Login
  Como usuario quero preenche os dados de acesso para realizar login

  
  Scenario: Login valido
    Given que esteja na tela de login
    And informo o user 
    And informo o password
    When clico no botao de login 
    Then valido login realizado
    

