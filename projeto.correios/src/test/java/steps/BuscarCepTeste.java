package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import page.BuscarCepPage;
import page.HomePage;
import runner.Executa;

public class BuscarCepTeste {

	HomePage home = new HomePage();
	BuscarCepPage buscarCep = new BuscarCepPage();


	@Dado("que esteja na tela de busca de cep")
	public void queEstejaNaTelaDeBuscaDeCep() {
		Executa.iniciarTeste();

	}

	@Quando("informar os dado validos para busca")
	public void informarOsDadoValidosParaBusca()  {
		 home.buscarCep("06544-300");
		
	
	}
	@Entao("validao as informacoes do cep")
	public void validaoAsInformacoesDoCep() {
		buscarCep.validarDadosEndereco("Avenida dos Parques (Alphasítio)", "Tamboré", "Santana de Parnaíba/SP", "06544-300");
	
	}
	




}
