package alternativastop3;

public class HiloSimple extends Thread {

	/**
	 * El constructor
	 */
	public HiloSimple() {
	}
	public void parar() {
	}
	
	public void run() {
		int i=0;
		while(!isInterrupted()) {
			System.out.println("hilo" + i);
			i++;
		}
	}
}
