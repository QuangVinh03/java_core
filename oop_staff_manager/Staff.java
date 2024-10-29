package oop_staff_manager;

public abstract class Staff {
	private String name;
	private int age;
	private String sex;
	private String address;

	public Staff(String name, int age, String sex, String address) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Sex: " + sex + ", Address:" + address;
	}

}
