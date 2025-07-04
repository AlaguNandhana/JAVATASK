package jattask5;

import java.util.Scanner;

public class PatternNumbers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			
			int rows = sc.nextInt();
			int num = 1;
			for (int i=1; i<rows;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(num+ " ");
				num++;
				
				
			}
			System.out.println();
			}
		}	
				
	}

}
