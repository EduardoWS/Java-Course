package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		
		boolean comprouTV32 = (trabalho1 && trabalho2) ^ (trabalho1 || trabalho2);
		//boolean comprouTV32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV 43\"? " + comprouTV32);
		
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("Tomou sorvete? " + sorvete);
		
		
	}

}
