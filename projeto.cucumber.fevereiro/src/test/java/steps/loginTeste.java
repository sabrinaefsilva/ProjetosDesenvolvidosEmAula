package steps;

import Metodos.Metodos;
import Pages.HomePage;
import Runner.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTeste {

	HomePage home = new HomePage();
	Metodos metodos = new Metodos();
    
	@Given("que desejo fazer login")
	public void queDesejoFazerLogin() {
	   Executa.iniciarTeste();
	}
	@When("enviar dados validos")
	public void enviarDadosValidos() {
	    home.login("", "");
	}
	@Then("usuario logado")
	public void usuarioLogado() {
	  metodos.validarUrl();
	}



}
