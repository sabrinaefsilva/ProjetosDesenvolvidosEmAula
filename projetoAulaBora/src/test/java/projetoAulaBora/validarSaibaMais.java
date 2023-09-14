package projetoAulaBora;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validarSaibaMais {

	WebDriver driver;
	By saibaMais = By.xpath("//a[text()='Saiba Mais']");

	@Test
	public void testFormularioSaibaMais() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sabrina/AppData/Local/Temp/Temp1_gravacao_bora%20(2).zip/gravacao_bora/index.html");
		String janelaPrincipal = driver.getWindowHandle();
		driver.findElement(saibaMais).click();
		System.out.println(driver.getTitle());
		Set<String> janelasAbertas = driver.getWindowHandles();

		for (String janela : janelasAbertas) {
			if (!janela.equals(janelaPrincipal)) {
				driver.switchTo().window(janela);

			}
		}
		System.out.println(driver.getTitle());
		String janelaSelenium = driver.getTitle();
		assertEquals("Automação de Testes Java com Selenium", janelaSelenium);
		driver.quit();
	}

}
