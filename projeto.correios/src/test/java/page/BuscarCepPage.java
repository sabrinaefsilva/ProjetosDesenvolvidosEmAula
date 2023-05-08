package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class BuscarCepPage {
	By logradouro = By.xpath("//td[@data-th='Logradouro/Nome']");
	By bairro = By.xpath("//td[@data-th='Bairro/Distrito']");
	By localidade = By.xpath("//td[@data-th='Localidade/UF']");
	By cep = By.xpath("//td[@data-th='CEP']");
	
	Metodos metodo = new Metodos();
	
	public void validarDadosEndereco(String logradouro, String  bairro, String localidade, String cep ) {
		metodo.trocarDeAba();
		metodo.validarTexto(this.logradouro,logradouro);
		metodo.validarTexto(this.bairro,bairro);
		metodo.validarTexto(this.localidade,localidade);
		metodo.validarTexto(this.cep,cep);
		metodo.fechar();
	}
	}

