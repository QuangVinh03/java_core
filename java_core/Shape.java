package java_core;

import java.util.Set;

public abstract class Shape {
	protected String name;
	public Shape(String name) {
		this.name = name;
	}

	public abstract double calculateArea();

	public void displayInfo() {
		System.out.println("Shape: " + name);
		System.out.println("Area: " + calculateArea());
	}
}
class Circle extends Shape{
    private double radius;
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
	@Override
	public double calculateArea() {
		return 3.14*radius;
	}
}
