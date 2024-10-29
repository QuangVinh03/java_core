package java_core;

public class Thread2 extends Thread{
	@Override
	public void run() {
		for (int i = 11; i < 21; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1010);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
