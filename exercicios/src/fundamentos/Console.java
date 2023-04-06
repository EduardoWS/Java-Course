package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia\n\n");
		
		System.out.println("Bom");
		System.out.println("dia\n");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: R$%.2f\n\n", 3236.6987);
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("\nNome: " + nome);
		System.out.println("Idade: " + idade);
		
		
		entrada.close();
		
		
		
	}

}
