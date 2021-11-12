package Ejemplo1;

public class Hilo extends Thread implements Runnable{
	
	public Hilo() {
		
	}
	
	public void run() {
		//System.err.println("Hola soy el hilo");
		Principal p = new Principal();
		p.ejecuta();
		
	}

}
