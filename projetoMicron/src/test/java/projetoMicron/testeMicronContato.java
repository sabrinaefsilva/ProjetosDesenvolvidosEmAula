package projetoMicron;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testeMicronContato {

	@Test
	public void testContato() {

		By btnContato = By.xpath("//a[@href ='/contato']");
		By nome = By.xpath("//input[@name ='input[0|Nome]']");
		By email = By.xpath("//input[@name ='input[1|E-mail]']");
		By telefone = By.xpath("//input[@name ='input[3|Telefone]']");
		By cidadeEstado = By.xpath("//input[@name ='input[4|Cidade/ Estado]']");
		By msg = By.xpath("//*[@id='textarea-5-aa9887cf-b4e3-4e58-830f-cfce5288572c']");
		By btnEnviar = By.xpath("//*[@id=\"aa9887cf-b4e3-4e58-830f-cfce5288572c\"]/form/div[7]/button");
	//	By msgValidada = By.xpath("//*[@class='cs-form-message cs-form-message-valid']");

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://micronpulverizadores.com.br/");
		driver.manage().window().maximize();
		driver.findElement(btnContato).click();
		driver.findElement(btnEnviar).click();
		//driver.findElement(msgValidada);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,2850)", "");

		driver.findElement(nome).sendKeys("Sabrina Silva ");
		driver.findElement(email).sendKeys("Sabrina.e.franca@gmail.com");
		driver.findElement(telefone).sendKeys("11953745301");
		driver.findElement(cidadeEstado).sendKeys("São Paulo/SP");
		driver.findElement(msg).sendKeys("Eu automatizei seu site e entrei vários bugs!  QA na área!!");

		assertEquals("Micron - CONTATO", driver.getTitle());
		//assertEquals("Mensagem enviada com sucesso! Obrigado pelo contato ", driver.findElement(msgValidada));

		driver.quit();
	}

}
