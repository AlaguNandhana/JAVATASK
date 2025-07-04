package oops;

public class Main2 implements InterfaceA, InterfaceB{

	public static void main(String[] args) {
		Main2 obj = new Main2();
		obj.a();
		obj.b();

	}

	@Override
	public void b() {
		System.out.println("B method");
		
	}

	@Override
	public void a() {
		System.out.println("A method");
		
	}

	}

