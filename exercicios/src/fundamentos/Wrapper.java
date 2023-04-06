package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); // int
		Integer i2 = 10000; // int
		Integer i3 = Integer.parseInt(entrada.next()); // converte a string em inteiro
		Long l = 100000L;
		
		System.out.println(b.byteValue());  // valor primitivo que está dentro da classe
		System.out.println(i);				// imprime 10000 em Integer
		System.out.println(i2.toString());  // imprime a string '10000'
		System.out.println(i3);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");	// converte uma string em boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		System.out.println(bo.toString().substring(0, 1).toUpperCase() + bo.toString().substring(1));
		
		Character c = 'a'; 		// char
		System.out.println(c);
		
		Float f = 12.3F;
		System.out.println(f);
		
		Double d = 12123.2334;
		System.out.println(d);
		
		
		entrada.close();
	}

}
