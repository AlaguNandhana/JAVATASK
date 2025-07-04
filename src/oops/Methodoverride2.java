package oops;

public class Methodoverride2 extends Methodoverride1 {
	public void eat() {
		super.eat();
		System.out.println("You are eating");
		
	}
	public static void main(String[] args) {
		
		Methodoverride2 obj = new Methodoverride2();
		obj.eat();

	}

}
