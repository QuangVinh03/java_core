package oop_staff_manager;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Staff> list = new ArrayList<Staff>();
		Staff officer = new Officer("Vu Duong", 23, "male", "123 street abc", "security");
		Staff engineer = new Engineer("KeVink", 22, "male", "2 street Vo Dong", "IT");
		Staff worker = new Worker("Tri Than", 24, "male", "3 street 2/4", 2);
		
		StaffManager sm = new StaffManager();
		list.add(worker);
		list.add(engineer);
		list.add(officer);
		
		sm.findAll(list);
		
		sm.findAll(sm.findByName(list, "Kevinkdf"));
  
	}
	

}
