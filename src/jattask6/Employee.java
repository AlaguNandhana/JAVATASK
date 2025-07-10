package jattask6;

import java.util.Scanner;

public class Employee {
	  int id;
	 String firstName;
	  String lastName;
	  int salary;
	
	public Employee(int id,String firstName,String lastName,int salary) {
		 this.id = id;
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.salary = salary;
	}
	public int getID() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		
        return firstName + " " + lastName;
    }
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public int getAnnualSalary() {
		return salary * 12;
	}
 
		public int raiseSalary(int percent) {
			salary +=(salary*percent/100);
			return salary;
				
		}
	public String toString() {
		return "Employee ID="+id+",Name="+getName() +",Salary ="+salary;
		
	}
	public static void main(String[] args) {
		
		Scanner emp = new Scanner(System.in);
		
		System.out.println("Enter Employee ID :");
		int id = emp.nextInt();
		
		emp.nextLine();
		
		System.out.println("Enter Employee First Name :");
		String firstname = emp.nextLine();
		
		System.out.println("Enter Employee Last Name :");
		String lastname = emp.nextLine();
		
		System.out.println("Enter Monthly Salary :");
		int salary = emp.nextInt();
		//create object
		Employee employee1 = new Employee(id, firstname, lastname, salary);
		
		 // Display employee info     
        System.out.println(employee1);

        System.out.println("Annual Salary: " + employee1.getAnnualSalary());

        // Ask for percentage raise
        System.out.print("Enter raise percentage: ");
        int percent = emp.nextInt();

        employee1.raiseSalary(percent);
        System.out.println("Updated Salary after " + percent + "% raise: " +employee1.getAnnualSalary());

        // Final display
        System.out.println("\nFinal Employee Info:");
        System.out.println(employee1.toString());

        emp.close();
    }

	}

