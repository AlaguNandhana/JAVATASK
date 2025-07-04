package scannerclass;

import java.util.Scanner; 

public class Scannerclass1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Id num:");
	 int id = sc.nextInt();
	 sc.nextLine();
	 System.out.println("Enter name of the Employee");
	 String name = sc.nextLine();
	
	 System.out.println("Enter city name");
	 String city = sc.nextLine();
	 sc.nextLine();
	 
	 System.out.println("Id number:"+id);
	
	 System.out.println("Employee Name:"+name);
	
	 System.out.println("City name:"+city);
			
		}

	}


