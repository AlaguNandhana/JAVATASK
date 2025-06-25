package javasession3;

public class UnaryOperator {

	public static void main(String[] args) {
	int a = 5;
	int b = 9;
	int c = 11;
	
	
	System.out.println(a++); // post increment 
	System.out.println(a);	// a=6
	
	System.out.println(++b);// pre increment b=10
	System.out.println(c--);// post decrement
	
	System.out.println(--c);//pre decrement
	
	System.out.println(a++ + ++b);
	System.out.println(c-- - --c);
	}

}
