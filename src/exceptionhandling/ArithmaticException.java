package exceptionhandling;

public class ArithmaticException {

	public static void main(String[] args) {
		try {
			int a = 50;
			int b = 0;
			int c =a/b;
			
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide");
		}
	
	}

}




