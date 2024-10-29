package oop_cbgv;

public class Teacher extends Person {
	private double baseMoney;
	private double bonusMoney;
	private double penalty;
	private double grossMoney;

	public Teacher(int id, String name, int age, double baseMoney, double bonusMoney, double penalty) {
		super(id, name, age);
		this.baseMoney = baseMoney;
		this.bonusMoney = bonusMoney;
		this.penalty = penalty;
		this.grossMoney = this.baseMoney + this.bonusMoney - this.penalty;
	}

	public double getGrossMoney() {
		return grossMoney;
	}

	@Override
	public String toString() {
		return super.toString() + ", baseMoney: " + baseMoney + ", bonusMoney: " + bonusMoney + ", penalty: " + penalty
				+ ", grossMoney: " + this.grossMoney;
	}

}
