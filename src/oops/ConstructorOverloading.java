package oops;

public class ConstructorOverloading {
	
	ConstructorOverloading() {
		System.out.println("This is default constructor/This is no Argument Constructor");
	}
	ConstructorOverloading(int a) {
		System.out.println("Int Argument constructor");
	}
	ConstructorOverloading(String b) {
		System.out.println("String Argument constructor");
	}
	

	public static void main(String[] args) {
		ConstructorOverloading obj= new ConstructorOverloading();
		ConstructorOverloading obj1= new ConstructorOverloading(1);
		ConstructorOverloading obj2= new ConstructorOverloading("Java");
	}

}
