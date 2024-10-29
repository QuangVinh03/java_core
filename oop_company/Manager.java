package oop_company;

import java.util.ArrayList;

public class Manager extends People {
	private int numStaff;
	private ArrayList<Staff> staffs;

	public Manager(int ID, String name, String number, int workDays) {
		super(ID, name, number, workDays, 200);
		this.numStaff = 0;
		this.staffs = new ArrayList<Staff>();
	}

	public Manager() {
	}

	@Override
	public double calSalary() {
		return workDays*daySalary+100*numStaff;
	}
	
	public void addStaff(Staff staff) {
		staffs.add(staff);
		staff.setManagerName(this.name);
		numStaff++;
	}
	
	public ArrayList<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(ArrayList<Staff> staffs) {
		this.staffs = staffs;
	}
	

	public int getNumStaff() {
		return numStaff;
	}

	public void setNumStaff(int numStaff) {
		this.numStaff = numStaff;
	}

	@Override
	public String toString() {
		return "ID: "+ID+", name: "+name+", days:"+workDays+
				", salary per day:"+daySalary+", number of staff: "+numStaff;
	}

	public void show() {
		for(Staff s:staffs) System.out.println(s.toString());
	}
}
