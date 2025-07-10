package exceptionhandling;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c =a/b;
			
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println("Cant divide by zero");
		}
		System.out.println("Hello world");
	}

}
