package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utils.MassaDeDados;

public class LoginTest {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MassaDeDados massa = new MassaDeDados();

	@Given("que esteja na tela de login")
	public void queEstejaAnTelaDeLogin() {
		Executa.abrirNavegador();
	}

	@After
	public void finalizarTeste() {
		//Executa.fecharNavegador();
	}

	@Given("prencher o usuario")
	public void prencherOUsuario() {
		metodos.escrever(el.name, massa.standard_user);
	}

	@Given("preencher a senha")
	public void preencherASenha() {
		metodos.escrever(el.password, massa.senha);
	}

	@When("realizar o login")
	public void realizarOLogin() {
		metodos.clicar(el.btnLogin);
	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		metodos.currentUrl("https://www.saucedemo.com/inventory.html");
	}

	@Given("prencher o usuario bloqueado")
	public void prencherOUsuarioBloqueado() {
		metodos.escrever(el.name, massa.locked_out_user);
	}

	@Then("sistema apresenta mensagem de usuario bloqueado")
	public void sistemaApresentaMensagemDeUsuarioBloqueado() {
		metodos.validarTexto(el.msgBlock, null);

	}

	@Given("prencher o usuario invalido")
	public void prencherOUsuarioInvalido() {

	}

	@Given("peencher a senha invalida")
	public void peencherASenhaInvalida() {

	}

	@Then("sistema apresenta mensagem de usuario e senha invalida")
	public void sistemaApresentaMensagemDeUsuarioESenhaInvalida() {

	}

	@Given("nao prencher nenhum dado")
	public void naoPrencherNenhumDado() {

	}

	@Then("sistema apresenta mensagem de dados em branco")
	public void sistemaApresentaMensagemDeDadosEmBranco() {

	}

}
