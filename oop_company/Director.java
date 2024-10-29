package oop_company;

public class Director extends People{
	private double share;
	public Director(int ID, String name, String number, int workDays, double daySalary,double share) {
		super(ID, name, number, workDays, 300);
		if(share<1) this.share = share;
	}

	@Override
	public double calSalary() {
		return daySalary*workDays;
	}

	
}
