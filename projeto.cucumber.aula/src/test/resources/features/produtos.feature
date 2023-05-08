@teste
Feature: Validar sobre
  Como usuario quero acessar sobre para validar informacoes

  
  Scenario: Validar sobre
    Given que esteja autenticado 
    When clica em about 
    Then valido texto