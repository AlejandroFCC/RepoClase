package alternativastop2;

public class HiloSimple extends Thread {

	private boolean pararhilo;
	/**
	 * El constructor
	 */
	public HiloSimple() {
		pararhilo=false;
	}
	public void parar() {
		pararhilo = false;
	}
	
	public void run() {
		int i=0;
		while(!pararhilo) {
			System.out.println("hilo" + i);
			i++;
		}
	}
}
