package java_core;

public class Thread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
