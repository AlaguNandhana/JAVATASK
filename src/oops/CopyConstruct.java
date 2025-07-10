package oops;

public class CopyConstruct {

	String str;
	int num;
	
	public CopyConstruct(String a, int b) {
		str= a;
		num = b;
		
	}
	
	public CopyConstruct(CopyConstruct test) {
		str=test.str;
		num= test.num;
		
	}
	public void display() {
		System.out.println(str+" "+num);
	}
	

	public static void main(String[] args) {
		CopyConstruct obj1= new CopyConstruct("Alice",18);
		CopyConstruct obj2= new CopyConstruct(obj1);
		obj1.display();
		obj2.display();
	}
	}
	