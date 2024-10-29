package java_core;

public class Car implements Run{

	@Override
	public void run() {
		System.out.println("run" + this.speed);
	}
public static void main(String[] args) {
	Car car = new Car();
	car.run();
}
}
