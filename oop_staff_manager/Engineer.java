package oop_staff_manager;

public class Engineer extends Staff {
	
	private String major;
	
	public Engineer(String name, int age, String sex, String address, String major) {
		super(name, age, sex, address);
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString()+", Major: " + major;
	}

}
