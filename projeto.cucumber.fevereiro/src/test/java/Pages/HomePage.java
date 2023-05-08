package Pages;

import org.openqa.selenium.By;

import Metodos.Metodos;

public class HomePage  {

	By user = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");

	Metodos metodo = new Metodos();

	public void login(String user, String password) {
		metodo.escrever(this.user, user);
		metodo.escrever(this.password, password);
		metodo.clicar(btnLogin);

	}
}
