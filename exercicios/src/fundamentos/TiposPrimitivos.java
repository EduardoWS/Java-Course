package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 26; 	// range -128 até 127
		short numeroDeVoos = 526; 	// range -32768 até 32767
		int id = 5962371; 			// range -2 bilhões até 2 bilhões
		long pontosAcumulados = 3_223_589_654L;		// range -9 quintilhões até 9 quintilhões
		
		// Tipos numéricos reais
		float salario = 11_544.27F;
		double vendasAcumuladas = 2_938_219_527.56;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A';  // Ativo
				
		
		
		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa*365);
		
		// Número de viagens
		System.out.println("Número de viagens: " + numeroDeVoos/2);
		
		// Pontos por real
		System.out.println("Pontos por R$: " + pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + " ganha: R$" + salario);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}

}
