package Package;

import java.util.ArrayList;

public class chefDavid {
	
	public static final int COCINEROS=5;
	
	
	public static void main(String[] args) {
		
		int nIngredientes=Teclado.solicitarEntero("¿Cuantos ingredientes desea?(tengo 5 cocineros)");
		
		
		
		int rangoATrabajar = nIngredientes/COCINEROS;
		int rangoSobrante = nIngredientes%COCINEROS;
		
		// Alejandro Franco Carretero Castillo
		ArrayList<cocineros> cocinero= new ArrayList<cocineros>();
		
		for (int i = 0; i < COCINEROS; i++) {
			cocinero.add(new cocineros());
						
		}
		
		for (int i = 0; i < cocinero.size(); i++) {
			cocinero.get(i).start();
		}
		
		for (cocineros hilospasados: cocinero) {
			try {
				hilospasados.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < cocinero.size(); i++) {
			System.out.println("el cocinero: "+cocinero.get(i).getName()+" ha utilizado "+cocinero.get(i).getIngrediente());
		}
		
		System.out.println("He terminado con el plato.");
	}

}
