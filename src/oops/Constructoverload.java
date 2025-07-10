package oops;

public class Constructoverload {
	
	Constructoverload(){
		System.out.println("This is default Constructor");
		
	}

	Constructoverload(int x){
		System.out.println("This is Int Argument Constructor");
		
	}

	Constructoverload(String y){
		System.out.println("This is String Argument Constructor");
		
	}
	

	public static void main(String[] args) {
		Constructoverload obj=new Constructoverload();
		Constructoverload obj1=new Constructoverload(5);
		Constructoverload obj2=new Constructoverload("JAVAPROGRAM");
	}

}
