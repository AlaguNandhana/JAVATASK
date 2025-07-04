package jattask5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the text");
			String original = sc.nextLine();
			String reversed = "";
			 
			int i = original.length()-1;
			while(i>=0) {
				reversed += original.charAt(i);
				i--;
			
			}
			if(original.equals(reversed)) {
			System.out.println("It is a Palindrome");
			}else {
				System.out.println("It is not a palindrome");
			}
		}
		
	

	}

}

	


