package jattask4;


public class Q5PrimeNumber {

	
		public static void main(String[] args) {
			int number = 17;
	        boolean isPrime = true;

	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break; // No need to check further
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}