package projetoAulaBora;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testeBora {

	ChromeDriver driver;
	By btnSaibaMais = By.xpath(null);
	
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sabrina/AppData/Local/Temp/Temp1_gravacao_bora.zip/gravacao_bora/index.html");
		String janelaPrincipal = driver.getWindowHandle();
		driver.findElement(btnSaibaMais).click();
		Set<String>janelasAbertas = driver.getWindowHandles();
		for(String janela : janelasAbertas) {
			if (!janela.equals(janelaPrincipal)) {
				driver.switchTo().window(janela);
			}
		}
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(janelaPrincipal);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
