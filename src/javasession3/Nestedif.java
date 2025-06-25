package javasession3;

public class Nestedif {

	public static void main(String[] args) {
		int age = 10;
		int weight = 55;
		// outer if block 
		if (age> 18) {
			//inner if block
			if(weight> 50)
			{
				System.out.println("Eligible for blood donation");
			}
			else {
				System.out.println("Not Eligible for blood donation");	
				
			} 
		}// the inner loop must be closed   
		else {
				System.out.println("Age must be greater than 18");
			}
		}

	}


