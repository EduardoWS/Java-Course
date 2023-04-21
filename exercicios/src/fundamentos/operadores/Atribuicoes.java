package fundamentos.operadores;

public class Atribuicoes {
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 3;
		b = 2;
		c = 0;
		
		c += a; 	// c = c + a;
		c -= b; 	// c = c - b;
		c *= a; 	// c = c * a;
		c /= 3;		// c = c / 3;
		c %= 2;		// c = c % 2;
			
		System.out.println(c);
		
	}

}
