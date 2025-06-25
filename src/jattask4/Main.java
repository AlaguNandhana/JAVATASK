package jattask4;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		  
		  System.out.println("Enter the first number");
		  
		  int num1 = sc.nextInt();
		
		  System.out.println("Enter the second number");
		  
				  int num2 = sc.nextInt();
				  
		  int temp = num1;
		  num1 = num2;
		  num2 = temp;
		  System.out.println(" After Swapping ");
		  System.out.println(" First number : "+num1);
		  System.out.println("Second number :"+num2);
				

	}

}
