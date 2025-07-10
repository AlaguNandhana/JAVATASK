package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException1 {

	public static void main(String[] args) {
		try {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the Number");
		 
		 int num = sc.nextInt();
		 System.out.println("Entered number is "+num);
		}
	catch (InputMismatchException ie) {
		System.out.println("Enter a valid input");

	}

}
}