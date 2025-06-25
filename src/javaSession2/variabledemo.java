package javaSession2;

public class variabledemo {
	
	int z=99;  // Global variable
	static int x=100; // static variable

	public static void main(String[] args) {
		
		variabledemo obj=new variabledemo();
		
		int a=5;// local variable
		
		System.out.println(a);
		System.out.println(obj.z);// to call the global variable inside the method
		
		

	}

}
