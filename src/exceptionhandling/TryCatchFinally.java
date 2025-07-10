package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		try 
		{ 
			int[] a = {10, 20, 30,40,50};
		
        System.out.println("Array value at index 5: " + a[7]); 
	}
	catch (ArrayIndexOutOfBoundsException ae) {
		System.out.println("Please Enter valid input");
		
	}
		finally {
			System.out.println("welcome to java program");	
		}
	}
}