package jattask7;

public class JavaProgram2IndexOutofBounds {

	public static void main(String[] args) {
		// ArrayIndexOutofBoundException
		
		try {
			int [] arr = {10, 20 ,30 ,40,50};
			System.out.println(arr[9]); //Invalid Index
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array error :"+e.getMessage());
		}
			
		
		//STringIndexOutofBoundsException
		
		try {
			String str = "JavaProgram";
			System.out.println(str.charAt(11));
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("String Error: "+e.getMessage());
				
			}
	}

}
