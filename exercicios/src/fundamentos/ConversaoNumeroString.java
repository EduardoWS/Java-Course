package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());  // converteu para string para poder usar o length
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		
	}

}
