package projetoBoraJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.Calculadora;

public class calculadoraTest {

	Calculadora calc = new Calculadora();

	@Test
	public void testSoma() {
		assertEquals(15, calc.soma(5, 10));
	}

	@Test
	public void testSubtrair() {
		assertEquals(10, calc.subtrair(20, 10));
	}

	@Test
	public void testdidividir() {
		assertEquals(3, calc.dividir(30, 10));
	}

	@Test
	public void testMultiplicar() {
		assertEquals(200, calc.multiplicar(20, 10));
	}

}
