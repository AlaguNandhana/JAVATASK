package jattask5;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
		
		
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a+" is the largest number among the three numbers");
		}else if(b>a && b>c) {
			System.out.println(b+" is the largest number among the three numbers");
		} else  {
		 System.out.println(c+" is the largest number among the three numbers");
		}
				
	}
}
	
}
