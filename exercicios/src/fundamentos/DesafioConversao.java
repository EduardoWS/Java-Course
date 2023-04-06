package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Salário 1: R$");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.print("Salário 2: R$");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.print("Salário 3: R$");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double media = (sal1 + sal2 + sal3)/3;
		
		System.out.printf("\nA média é: R$%.2f", media);

		entrada.close();
	}

}
