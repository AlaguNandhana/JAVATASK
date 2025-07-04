package oops;

public class MainC extends A1 implements InterfaceB1{

	public static void main(String[] args) {
		
		MainC obj = new MainC();
		obj.testA();
		obj.testB();
		

	}
 public void testB() {
	 System.out.println("testB");
 }

	@Override
	void testA() {
		System.out.println("testA");
		
	}

}
