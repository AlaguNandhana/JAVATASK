package javaSession2;

public class Sample5 {

	public static void main(String[] args) {
		// Declare a variable 'step', step in loop
		int step = 1;
		// Declare a variable value with the start value is 0
		// After each iteration, value will increase 3
		// And the loop will end when the value greater than or equal to 10
		for (int i = 0; i < 10; i = i + 3) {
		System.out.println("Step =" + step + " value = " +i);
		// Increase 1
		step = step + 1;
		}
		}
		}