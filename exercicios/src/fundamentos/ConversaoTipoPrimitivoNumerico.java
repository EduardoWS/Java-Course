package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1;	// Convers�o Impl�cita de int para double
		System.out.println(a);
		
		float b = (float) 1.1;		// Convers�o Expl�cita (cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;			// Convers�o Expl�cita (cast)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;			// Convers�o Expl�cita (cast)
		System.out.println(f);
	}

}
