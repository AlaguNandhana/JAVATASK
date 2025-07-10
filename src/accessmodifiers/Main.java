package accessmodifiers;

public class Main{
	
	public int a=5;
	protected int b=10;
	int c= 15;
	private int d=20;
	
	public void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}



	public static void main(String[] args) {
		
		Main obj=new Main();
		obj.disp();

	}

}
