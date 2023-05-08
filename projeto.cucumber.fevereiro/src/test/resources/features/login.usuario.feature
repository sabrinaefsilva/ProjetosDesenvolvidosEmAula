
@regressivo
Feature: Login
	Como usuario 
	Quero realizar login
	Para comprar produtos
 
 
  Scenario: Login
    Given que desejo fazer login
    When enviar dados validos
    Then usuario logado
  