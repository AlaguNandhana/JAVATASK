package jattask6;

public class Circle {
	
	private double radius;
	
	
	public Circle() {
		radius = 10.0;
	
	}
	public Circle(double radius) {
		this.radius= radius;
	
	}

		public double getCircumference() {
			return 2* Math.PI*radius;
	
		}
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.0);
		
		
		System.out.println("C1 circumference :"+c1.getCircumference());
		System.out.println("C2 circumference :"+c2.getCircumference());
	}

}
