package jattask4;

public class Q6Factorial {

	public static void main(String[] args) { 
		
		int a = 15;
        long factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + a + " is: " + factorial);
    


	}

}
