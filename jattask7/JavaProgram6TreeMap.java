package jattask7;

import java.util.*;
public class JavaProgram6TreeMap {

		    public static void main(String[] args) {
		        TreeMap<Integer, String> empMap = new TreeMap<>();
		        empMap.put(102, "Peter");
		        empMap.put(101, "Jack");
		        empMap.put(103, "Zen");
		        empMap.put(104, "Rose");
		        empMap.put(105, "Amy");
		        
		        List<String> names = new ArrayList<>(empMap.values());
		        Collections.sort(names);

		        System.out.println("Employee names in alphabetical order:");
		       
		        
		        for (String name : names) {
		        	System.out.println(name);
		       
		    }


	}

}
