package jattask4;

public class Q10CountNumber {

	public static void main(String[] args) {
			
		int num = 1234567890;
		int i = 0;
		 while (num!= 0) {
			 num = num/10;
			 i++;
			 
		 }
		 	System.out.println("Number of digits: "+i);
	}

}
