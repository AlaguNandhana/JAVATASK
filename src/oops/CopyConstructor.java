package oops;

public class CopyConstructor {
	
	
	String name;// global variable
	int age;// global variable
	
	public CopyConstructor(String a, int b) {
		name= a;
		age = b;
		
	}
	
	public CopyConstructor(CopyConstructor test) {
		name=test.name;
		age= test.age;
		
	}
	public void display() {
		System.out.println(name+" "+age);
	}
	
	public static void main(String[] args) {
		CopyConstructor obj1= new CopyConstructor("Simon",39);
		CopyConstructor obj2= new CopyConstructor(obj1);
		obj1.display();
		obj2.display();
	
	}
	

}
