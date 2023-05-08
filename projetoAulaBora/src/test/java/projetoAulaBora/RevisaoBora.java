package projetoAulaBora;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RevisaoBora {

	@Test
	public void preencherFormulario() {
		// ELEMENTOS WEB DA PÁGINA
		/*By titulo = By.xpath("/html/body/header/h1");
		By nome = By.id("nome");
		By sobreNome = By.name("sobrenome");
		By email = By.id("email");
		By dataNascimento = By.xpath("//*[@id=\"data_nasc\"]");*/
		//By btnContato = By.xpath("//a[@href ='/contato']");

		// ABRIR O NAVEGADOR
		ChromeDriver driver;// comunicar com a página web

		WebDriverManager.chromedriver().setup();// configurar o navegador
		driver = new ChromeDriver();// abrir o navegador
		driver.manage().window().maximize();// maximizar o navegador

		// acessar o site
		driver.get("https://micronpulverizadores.com.br");

		/* pegando os textos
		System.out.println(driver.findElement(titulo).getText());
		

		// Validando o titlulo e subtitulo
		assertEquals("Cadastro de Aluno E2E Treinamentos", driver.findElement(titulo).getText());
		

		// validar o title do site
		assertEquals("Formulário", driver.getTitle());

		// preenchendo os campos
		driver.findElement(nome).sendKeys("Sabrina ");
		driver.findElement(sobreNome).sendKeys("Silva");
		driver.findElement(email).sendKeys("sabrina.e.franca@gmail.com");
		driver.findElement(dataNascimento).sendKeys("18/09/1990");*/

		// clicando no botao
		
		//validar o site da escola title
		//assertEquals("Formulário", driver.getTitle());

		// fechar o Navegador
		//driver.quit();

	}

}
