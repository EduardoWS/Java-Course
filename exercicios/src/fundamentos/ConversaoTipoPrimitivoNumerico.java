package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1;	// Conversão Implícita de int para double
		System.out.println(a);
		
		float b = (float) 1.1;		// Conversão Explícita (cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;			// Conversão Explícita (cast)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;			// Conversão Explícita (cast)
		System.out.println(f);
	}

}
