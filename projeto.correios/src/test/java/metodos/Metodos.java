package metodos;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void scrool() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroolBy(0,300)", "");

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void esperarClicar(By elemento, int qtd, int segundos) {
		WebElement elementoFechar = driver.findElement(elemento);
		elementoFechar = new WebDriverWait(driver, Duration.ofSeconds(segundos))
				.until(ExpectedConditions.elementToBeClickable(elemento));
		while (elementoFechar.isDisplayed() && qtd > 0) {
			elementoFechar.click();
			qtd--;
		}
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void limparCampo(By elemento) {
		driver.findElement(elemento).clear();
	}

	public void trocarDeAba() {
		String janelaAtual = driver.getWindowHandle();
		Set<String> janelas = driver.getWindowHandles();

		for (String janela : janelas) {
			driver.switchTo().window(janela);
			System.out.println("Endereço do site" + driver.getCurrentUrl());
		}
	}
		public void validarTexto (By elemento, String textoDesejado) {
			String textoCapturado =  driver.findElement(elemento).getText();
			assertEquals(textoDesejado, textoCapturado);
		}
		public void fechar() {
			driver.quit();
		}
	}

