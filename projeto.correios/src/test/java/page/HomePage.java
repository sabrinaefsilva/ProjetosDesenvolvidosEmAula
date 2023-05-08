package page;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;

public class HomePage {
	
	By buscarCep = By.id("relaxation");
	Elementos el = new Elementos();
	
	Metodos metodo = new Metodos();
	
	
	public void acompanheObjeto() {
		
	}

	public void buscarCep(String cep) {
		metodo.scrool();
		metodo.escrever(buscarCep,cep);
		metodo.esperarClicar(el.carolFecha, 3, 3);
		metodo.submit(buscarCep);
		
	}

	public void encontreAgencia() {

	}

	public void precoPrazos() {

	}

	public void minhasImportacoes() {

	} 
}
