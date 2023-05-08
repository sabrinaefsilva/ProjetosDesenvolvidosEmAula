package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import driver.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("Erro ao tentar escrever no elemento" + elemento);
		}
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("Erro ao tentar clicar no elemento" + elemento);
		}
	}

	public void currentUrl(String UrlDesejada) {
		try {
			assertEquals(UrlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a url desejada" + UrlDesejada);
		}
	}

	public void validarTexto(By elemento, String MensagemEsperada) {
		try {
			String msgCapturada = driver.findElement(elemento).getText();
			assertEquals(MensagemEsperada, msgCapturada);
		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a mensagem" + MensagemEsperada);

		}
	}
}
