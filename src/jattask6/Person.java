package jattask6;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
		
	}

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		
		System.out.println("Enter your age :");
		int  age = sc.nextInt();
		
	Person person1 = new Person(name,age);
	
	System.out.println("Name :"+person1.getName());
	System.out.println("Age :"+person1.getAge());
	
	sc.close();
	}
		
		
	}


