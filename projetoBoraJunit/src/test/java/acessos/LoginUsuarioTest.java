package acessos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoginUsuarioTest {

	@Test
	public void testLoginComSucesso() {

		String user = "admin";
		String password = "123456";
		String msgEsperada = "Login realizado com sucesso";
		String resultado = LoginUsuario.login(user, password);
		assertEquals(msgEsperada, resultado);

	}
	
	@Test
	public void testSenhaEmBranco() {

		String user = "admin";
		String password = "";
		String msgEsperada = "Senha Invalida";
		String resultado = LoginUsuario.login(user, password);
		assertEquals(msgEsperada, resultado);

	}
	
	@Test
	public void testUsuarioInvalido() {

		String user = "usererrado";
		String password = "123456";
		String msgEsperada = "Username inválido";
		String resultado = LoginUsuario.login(user, password);
		assertEquals(msgEsperada, resultado);

	}
	
	@Test
	public void testSenhaInvalida() {

		String user = "adimin";
		String password = "456789";
		String msgEsperada = "Username inválido";
		String resultado = LoginUsuario.login(user, password);
		assertEquals(msgEsperada, resultado);

	}

}
