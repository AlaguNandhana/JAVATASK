package jattask7;

import java.util.Scanner;

public class JavaProgram1Exception {
			//int num1;
		//	int num2;
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number :");
		int num2 = sc.nextInt();
			
		
		try{
			
	//		if (num2>0) {
			int result = num1/num2;
			System.out.println("Result :"+result);
	//		} else {
		//		System.out.println("Error: Cannot divide by zero");
	//				}
		
			} catch (ArithmeticException e) {
		
			System.out.println("Caught Exception:"+e.getMessage());
		}
		
		sc.close();
	}

}
