package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 26; 	// range -128 at� 127
		short numeroDeVoos = 526; 	// range -32768 at� 32767
		int id = 5962371; 			// range -2 bilh�es at� 2 bilh�es
		long pontosAcumulados = 3_223_589_654L;		// range -9 quintilh�es at� 9 quintilh�es
		
		// Tipos num�ricos reais
		float salario = 11_544.27F;
		double vendasAcumuladas = 2_938_219_527.56;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A';  // Ativo
				
		
		
		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa*365);
		
		// N�mero de viagens
		System.out.println("N�mero de viagens: " + numeroDeVoos/2);
		
		// Pontos por real
		System.out.println("Pontos por R$: " + pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + " ganha: R$" + salario);
		System.out.println("F�rias: " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}

}
