package oop_company;

public class Staff extends People{
	
	private String managerName;
	
	public Staff(int ID, String name, String number, int workDays) {
		super(ID, name, number, workDays, 100);
	}

	@Override
	public double calSalary() {
		return workDays*daySalary;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "ID: "+ID+", name: "+name+", days:"+workDays+
				", salary per day:"+daySalary+", manager's name: "+managerName;
	}
	
	

}
