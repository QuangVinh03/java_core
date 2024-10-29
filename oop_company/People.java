package oop_company;

public abstract class People implements IPeople{
	protected int ID;
	protected String name;
	protected String number;
	protected int workDays;
	protected double daySalary;
	
	public People(int ID, String name, String number, int workDays, double daySalary) {
		this.ID = ID;
		this.name = name;
		this.number = number;
		this.workDays = workDays;
		this.daySalary = daySalary;
	}
	public People() {
		
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

	public abstract double calSalary(); 
		
	
}
