package oops;

public class Parameterised1 {

	int num;
	String name;
	String city;  
	
	
	Parameterised1(int a,String b, String c) {
		num=a;
		name=b;
		city=c;
		
	}
	public void display() {
		System.out.println(num+" "+name+" "+city);
		
		
	}
	

	public static void main(String[] args) {
		
		Parameterised1 obj1= new Parameterised1(5,"John","NYC");
		obj1.display();
		
	}

}
