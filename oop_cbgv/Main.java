package oop_cbgv;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Teacher(1,"John",34, 1000, 200, 50);
		Person p2 = new Teacher(2,"Michale",44, 2000, 200, 0);
		TeacherManager tm = new TeacherManager();
		tm.addTeacher(p1);
		tm.addTeacher(p2);
		tm.deleteTeacher(p1);
		tm.showList(tm.getTeachers());
	}
}
