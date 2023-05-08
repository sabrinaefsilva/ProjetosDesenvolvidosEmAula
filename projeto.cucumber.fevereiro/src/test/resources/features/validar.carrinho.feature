
@tag
Feature: Validar Carrinho
Como usuario  
Quero incluir produtos no carrinho
Para realizar compras
  
Background: Login no site
Given que esteja logado

  @positivo
  
  Scenario: Incluir produto no carrinho
    And escolher um produto
    When acessar o carrinho 
    Then valido o produto no carrinho
