package fundamentos.operadores;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CalculadoraTest {
	
	@Test
	public void somaDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(10, 20);
		Assertions.assertEquals(30, soma);
		
	}
	
}
