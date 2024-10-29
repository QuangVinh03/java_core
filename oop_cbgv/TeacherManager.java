package oop_cbgv;

import java.util.ArrayList;
import java.util.List;

public class TeacherManager implements ITeacher {
	
	public List<Person> people ;
	

	public TeacherManager() {
		this.people = new ArrayList<Person>();
	}
	  public List<Person> getTeachers() {
	        return this.people;
	    }

	@Override
	public void addTeacher(Person person) {
		this.people.add(person);
		
	}

	@Override
	public void deleteTeacher(Person person) {
		this.people.remove(person);		
	}
	
	public void showList(List<Person> people) {
		for(Person p:people) {
			System.out.println(p);
		}
	}

}
