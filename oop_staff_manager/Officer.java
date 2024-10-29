package oop_staff_manager;

public class Officer extends Staff {
	private String job;

	public Officer(String name, int age, String sex, String address, String job) {
		super(name, age, sex, address);
		this.job = job;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Job: " + job;
	}

}
