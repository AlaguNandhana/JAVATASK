package jattask7;

import java.util.*;


public class JavaProgram7ListtoArray {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Maths");
		list.add("Science");
		list.add("English");
		list.add("ComputerScience");
		
		System.out.println(list);
		
		String[] array = list.toArray(new String[0]);
		
			System.out.println("Array Contents :");
			
			for(String lang : array) {
				System.out.println(lang);
				
			}

	}

}
