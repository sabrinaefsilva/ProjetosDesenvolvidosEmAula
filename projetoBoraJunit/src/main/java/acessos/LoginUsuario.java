package acessos;

public class LoginUsuario {

	private static String usuario = "admin";
	private static String senha = "123456";

	public static String login(String username, String password) {

		if (!username.equals(usuario)) {
			return "Username inválido";
		}
		if (!senha.equals(password)) {
			return "Senha Invalida";
		}

		return "Login realizado com sucesso";
	}

}
