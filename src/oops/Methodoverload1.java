package oops;

public class Methodoverload1 {
	 
	public void sum(int a,int b) {
		System.out.println(a+b);
		
	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
		
	}
	public void sum(int a,int b,float c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		Methodoverload1 obj = new Methodoverload1();
		obj.sum(10, 20);
		obj.sum(100, 50, 50);
		obj.sum(10 , 20, 99.5f);
	}

}
