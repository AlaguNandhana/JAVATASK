package jattask7;


 
 
	public class AgeValidator {
		public static void validateAge(int age) throws InvalidAgeException {
			
			if(age< 18) {
				throw new InvalidAgeException ("Age must be 18 or above.");
				}
			}
	

		public static void main(String[] args) {
	
			try {
				validateAge(15); // test
			} catch(InvalidAgeException e) {
				System.out.println("Error:" +e.getMessage());
				
			}
		}
}

