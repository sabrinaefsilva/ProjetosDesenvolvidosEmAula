package projetoAulaBora;

import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class testeBora {
	WebDriver driver;
	// ChromeDriver driver;
	By btnSaibaMais = By.xpath("//*[text()='Saiba Mais']");

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sabrina/AppData/Local/Temp/Temp1_gravacao_bora%20-%20novo%20versao.zip/gravacao_bora%20-%20novo%20versao/index.html");
		String janelaPrincipal = driver.getWindowHandle();
		driver.findElement(btnSaibaMais).click();
		Set<String> janelasAbertas = driver.getWindowHandles();
		for (String janela : janelasAbertas) {
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
