package Package;

public class Actividad2 extends Thread{
	public static void main(String[] args) {
		
		Actividad2 hilo= new Actividad2();
		hilo.start();
		
	}
	
	public void run() {
		int i=0;
		while (true) {
			try {
				i++;
				System.out.println(i);
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
