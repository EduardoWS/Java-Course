package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String frase = "Hello, world";
		frase = frase.replace("world", "Edu");
		frase = frase.concat("!!!");
		frase = frase.toUpperCase();
		
		System.out.println(frase);
		
		System.out.println("edu".toUpperCase());
		
		String frase2 = "Somos Apenas esse momento"
												.concat(".")
												.replace("S", "1")
												.toLowerCase()
												.replace("1", "S");
		System.out.println("\n" + frase2);
		
		
		// Tipos primitivos não têm o operador "."
											
	}

}
