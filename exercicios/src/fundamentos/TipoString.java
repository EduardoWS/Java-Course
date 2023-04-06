package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá pessoas!!".charAt(5));
		
		String s = "Boa tarde";
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 27;
		var salario = 4783.59;
		
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f", 
										nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f\n", 
										nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}

}
