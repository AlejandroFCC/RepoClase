package Ejemplo1;

public class Principal {
	static int numero=0;
	
	public void ejecuta() {
		
		/*for (int i = 0; i < 100; i++) {
			Hilo h = new Hilo();
			h.start();
		}
			*/
		//int numero=0;
		
		for (int i = numero; i < 50; i++) {
			numero++;			
		}
		
		System.out.println("Final = " + numero);
		System.err.println("Terminé");
	}

}
