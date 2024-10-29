package oop_staff_manager;

import java.util.List;

public interface IStaffManagement {
	public void addStaff(Staff staff);
	public List<Staff> findByName(List<Staff> staffs, String name);
	public void findAll(List<Staff> staffs);
}
