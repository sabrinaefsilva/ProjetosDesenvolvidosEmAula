package Metodos;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import Drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		String pneu = driver.findElement(elemento).getText();
		assertTrue(pneu.contains("Pirelli"));
		
		
	}

	public void validarUrl() {
		// TODO Auto-generated method stub
		
	}

}
