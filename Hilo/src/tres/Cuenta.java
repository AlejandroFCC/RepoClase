package tres;

public class Cuenta {
	private int saldo;

	Cuenta(int s) {
		saldo = s;
	}

	int getSaldo() {
		return saldo;
	}

	synchronized void restar(int cantidad) {

		saldo = saldo - cantidad;

	}

	/**
	 * Comprueba que el dinero que va a retirarse está en la cuenta Si hay
	 * suficiente duerme 0,5 segundos y se lo resta a la cuenta Muestra el nombre de
	 * quien se ha llevado el dinero y de cuanto saldo queda Si no hay dinero
	 * suficiente muestra el mensaje Si el saldo es negativo muestra el mensaje
	 * 
	 * @param cant
	 * @param nom
	 */
	void RetirarDinero(int cant, String nom) {
		

		if (saldo > cant) {
			
			
			
			System.out.println("se esta tratando retirar dinero, saldo actual: "+getSaldo());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			restar(cant);
			System.out.println(nom+" ha retirado: "+cant+", saldo: "+getSaldo());
			

		} else if(saldo>0){
			
		}else
			System.out.println(nom+" ya no puedes retirar mas dinero");

	}// retirar
}
