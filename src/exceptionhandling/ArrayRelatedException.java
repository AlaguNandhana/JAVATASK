package exceptionhandling;

public class ArrayRelatedException {

	public static void main(String[] args) {
		try {
			
		int x[]= {11,22,33,44,55};
		System.out.println(x[7]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please enter the valid index Number");
			
		}
	}

}
