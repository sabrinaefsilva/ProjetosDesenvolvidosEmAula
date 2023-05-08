package projetoAulaBora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class teste {
	@Test
	public void test() {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.itau.com.br");
		driver.manage().window().maximize();
		String titulo = driver.getTitle();
		String url = driver.getCurrentUrl();
		assertEquals("Banco Itau | Feito com você", titulo);
		assertEquals("https://www.itau.com.br", url);
		
	}
}
