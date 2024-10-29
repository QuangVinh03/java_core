package oop_staff_manager;

public class Worker extends Staff{
	private int level;

	public Worker(String name, int age, String sex, String address,int level) {
		super(name, age, sex, address);
		this.level = level;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Level: " + level;
	}
	
}
