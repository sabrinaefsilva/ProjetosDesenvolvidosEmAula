
Feature: realizar o login do usuario
  como usuario quero realizar o login para validar o acesso

 
  Scenario: logincom sucasso
    Given que acesso o site "https://www.saucedemo.com"
    When preencho o campo usuario ""
    And preencho o campo senha ""
    And clico no botao login
    Then o login realizado com sucesso

  