package jattask7;

import java.io.*;

public class Javaprogram4FileNotFound {
	
    public static void main(String[] args) {
    	
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(file);
             String line;
             while((line =reader.readLine()) != null) {
            	 
            	 System.out.println(line);
             }
             reader.close();
        	} catch (FileNotFoundException e) {
        		System.out.println("Error: File Not Found.");
        	}catch (IOException e) {
        		System.out.println("Error reading the file.");
        	}
             }
}
