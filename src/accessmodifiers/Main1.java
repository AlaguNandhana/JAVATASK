package accessmodifiers;

class AM{
	public int a=5;
	protected int b=10;
	int c=15;
	private int d= 20;
	
}

public class Main1 {

	public static void main(String[] args) {
		
		AM obj= new AM();
		System.out.println(obj.a);// Public is accessible
		System.out.println(obj.b);//protected is accessible 
		System.out.println(obj.c);//default is accessible
	//	System.out.println(obj.d); private is not accessible
	}

}
