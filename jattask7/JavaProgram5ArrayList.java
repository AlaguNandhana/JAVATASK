package jattask7;

import java.util.ArrayList;

public class JavaProgram5ArrayList {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<>();
		list.add("Keys");
		list.add("Battery");
		list.add("Torch");
		list.add("Charger");
		
		
		System.out.println("List before removing :"+list);
		
		list.clear();
		
		System.out.println("List after removing :"+list);

	}

}
