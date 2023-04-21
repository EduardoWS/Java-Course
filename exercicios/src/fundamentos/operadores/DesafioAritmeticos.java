package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int esquerda_denominador, esquerda_numerador;
		int esquerda;
		int direita_denominador, direita_numerador;
		int direita;
		int numerador_principal, denominador_principal;
		int resultado;
		
		esquerda_numerador = (int) (Math.pow((6*(3+2)), 2));
		esquerda_denominador = 3*2;
		esquerda = esquerda_numerador / esquerda_denominador;
		//System.out.println(esquerda);
		
		direita_numerador = (int) Math.pow((1-5)*(2-7), 2);
		direita_denominador = 4;
		direita = direita_numerador/direita_denominador;
		//System.out.println(direita);
		
		numerador_principal = (int) Math.pow(esquerda - direita, 3);
		denominador_principal = (int) Math.pow(10, 3);
		
		resultado = numerador_principal / denominador_principal;
		
		System.out.println("O resultado da expressão é: " + resultado);
		
	}

}
