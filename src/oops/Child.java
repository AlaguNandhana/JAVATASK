package oops;

public class Child extends Parent {

	public void child( ) {
		System.out.println("This is child method");
		
	}
       public static void main (String[] args) {  
    	   Child obj=new Child(); 
    	   obj.grandparent();
    	   obj.parent();
    	   obj.child();
    	   
    	   
	}

}
