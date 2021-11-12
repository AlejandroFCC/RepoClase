package Ejemplo1;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			Hilo h = new Hilo();
			Thread milhilo = new Thread(h);
			h.start();
		}
		
	}

	
}
