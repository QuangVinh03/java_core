package oop_staff_manager;

import java.util.ArrayList;
import java.util.List;

public class StaffManager implements IStaffManagement {
	public List<Staff> staffs;

	public StaffManager() {
		this.staffs = new ArrayList<Staff>();
	}

	@Override
	public void addStaff(Staff staff) {
		this.staffs.add(staff);
	}

	@Override
	public List<Staff> findByName(List<Staff> staffs, String name) {
		List<Staff> res = new ArrayList<Staff>();
		for (Staff staff : staffs) {
			if (staff.getName().equalsIgnoreCase(name))
				res.add(staff);
		}
		return res;
	}

	@Override
	public void findAll(List<Staff> staffs) {
		for (Staff staff : staffs) {
			System.out.println(staff);
		}
	}

}
