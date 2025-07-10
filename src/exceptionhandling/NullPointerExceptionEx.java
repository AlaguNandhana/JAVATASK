package exceptionhandling;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		
		try {
			String name = null;
			System.out.println(name.length());
		}
		catch(NullPointerException ne) {
			
		System.out.println("INvalid input");
		
		}
	}

}
