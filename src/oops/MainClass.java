package oops;

public class MainClass extends Abstractclass1 {

	public static void main(String[] args) {
	
		MainClass obj = new MainClass();
		obj.eat();
		obj.a();
		
		// AbstractClass1 obj = new AbstractClass1();
		

	}

	@Override
	void eat() {
		System.out.println("Eating");
		
	}

}
