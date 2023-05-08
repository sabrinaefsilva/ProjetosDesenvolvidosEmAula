#language: pt

@buscarCep
Funcionalidade: BUscra Ceps
	Como usuario
	Quero informar dados de busca 
	Para encontar dados de endereco

  Contexto: Acessar a home do Correio
  	Dado que esteja na tela de busca de cep
  	
  	Cenario: buscar cep valido 
  	 Quando informar os dado validos para busca
  	 Entao validao as informacoes do cep