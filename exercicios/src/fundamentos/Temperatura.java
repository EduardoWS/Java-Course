package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double AJUSTE = 32;
		final double MULTIPLICADOR = 5.0/9.0;
		double tempF;
		double tempC;
		
		tempF = 100;
		
		tempC = (tempF - AJUSTE) * MULTIPLICADOR;
		
		System.out.println(tempF + " °F é igual a " + tempC + " °C");
		
	}

}
