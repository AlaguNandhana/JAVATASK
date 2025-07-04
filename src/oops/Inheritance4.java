package oops;

public class Inheritance4 extends Inheritance3 {

	
	public void multiply(int x,int y) {
		z= x*y;
		System.out.println("Multiply is = "+z);
	}
	public static void main(String[] args) {
		
		Inheritance4 obj = new Inheritance4();
		obj.add(15, 25);
		obj.multiply(10, 2);

	}

}
