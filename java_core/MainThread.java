package java_core;

public class MainThread {
	public static void main(String[] args) {
		Thread1 thread1 =  new Thread1();
		thread1.start();
		Thread2 thread2 =  new Thread2();
		thread2.start();
	}

}
