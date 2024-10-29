package oop_cbgv;

public abstract class Person {
	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", age: " + age;
	}
	
	

}
