package jattask5;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		
			System.out.println("Enter the number of the month:");
			int month = sc.nextInt();
		
			System.out.println("Enter the roomrent:");
			int roomrent = sc.nextInt();
		
			System.out.println("Enter the number of days:");
			int days = sc.nextInt();
			double totalrent;
			
			switch(month) {
			case 4: case 5: case 6:
			case 11: case 12:
				totalrent = roomrent * 1.20 * days;
				break;
				
				default:
					totalrent = roomrent * days;
				
		} 
			System.out.printf(" Total :%.2f", totalrent);
			
		}

	}

}
