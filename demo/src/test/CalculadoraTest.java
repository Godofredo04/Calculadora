package calculadoraTest;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import calculadora.Calculadora;
public class CalculadoraTest {
	
	Calculadora calc = new Calculadora();
	
	@BeforeAll
	static void setUpBeforeCass() throws Exception{
		System.out.println("--Inicio de las pruebas--");
		
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		System.out.println("--Fin de las pruebas--");
	}
	
	@Test
	void testSuma() {
		assertEquals(5, calc.sumar(2,3));
		assertEquals(-1, calc.sumar(-2, 1));
		assertEquals(0, calc.sumar(0, 0));
	}
	
	@Test
	void testRestar() {
		assertEquals(1, calc.restar(3, 2));
		assertEquals(5, calc.restar(2, -3));
		assertEquals(0, calc.restar(0, 0));
	}
	
	@Test
	void testMultiplicar() {
		assertEquals(6, calc.multiplicar(2, 3));
		assertEquals(-2, calc.multiplicar(-2, 1));
		assertEquals(0, calc.multiplicar(0, 5)); 
	}
	
	@Test
	void testDividir() {
		assertEquals(2, calc.division(6, 3));
		assertEquals(-2, calc.division(-6, 3));
		assertThrows(ArithmeticException.class, () -> calc.division(1, 0));
	}
	
	@Test
	void testCalculadora() {
		assertEquals(5, calc.calculadora(2, 3, 1));
		assertEquals(1, calc.calculadora(3, 2, 2));
		assertEquals(6, calc.calculadora(2, 3, 3));
		assertEquals(2, calc.calculadora(6, 3, 4));
	}
	
}
