package oop_company;

import java.util.ArrayList;

public class Company {
	private String name;
	private String taxID;
	private double monthRevenue;
	private ArrayList<People> people;
	
	public Company(String name, String taxID) {
		this.name = name;
		this.taxID = taxID;
		this.people = new ArrayList<People>();
	}
	public void addPeople(People person) {
		people.add(person);
	}
	public void removePeople(People person) {
		if(person.daySalary==200.0) {
			Manager manager = (Manager) person;
			int numStaff = manager.getNumStaff();
			for(Staff staff:new ArrayList<>(manager.getStaffs())) { // tạo bản sao để duyệt tất cả phần tử
				staff.setManagerName(null);
				manager.getStaffs().remove(staff);
				numStaff--;
			}
			manager.setNumStaff(numStaff);
		}
			else {
				people.remove(person);
			}
	}
	public void show() {
		for(People p:people) System.out.println(p.toString());
	}
	
	public static void main(String[] args) {
		Company com = new Company("Mc Donal", "TFH454355");
		Manager ql1 = new Manager(1, "Le Quang Vinh", "0325632662", 30);
		Staff nv1 = new Staff(2, "Le Thuy Vy", "0956732134", 25);
		Staff nv2 = new Staff(2, "Ngo Van Kha", "094674238", 21);
		Staff nv3 = new Staff(2, "Tran Quang Phu", "035453564", 30);
		Staff nv4 = new Staff(2, "Co Be Lo Lem", "0665732134", 29);
		ql1.addStaff(nv1);
		ql1.addStaff(nv4);
		
		com.addPeople(ql1);
		com.show();
		ql1.show();
		com.removePeople(ql1);
		System.out.println("=========");
		System.out.println(ql1);
		ql1.show();
	}
	
}
