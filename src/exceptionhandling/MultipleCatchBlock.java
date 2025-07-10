package exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try 
			
		(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number ");
            int x = sc.nextInt();
            int y= sc.nextInt();
            int z= x/y;
            System.out.println(z);
            
            
            int[] arr = {1, 2, 3};
            System.out.println("Array value at index 5: " + arr[5]); // Can throw ArrayIndexOutOfBoundsException

        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range.");
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
			
		

	}

}
