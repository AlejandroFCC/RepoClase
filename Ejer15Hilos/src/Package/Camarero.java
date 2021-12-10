package Package;

import java.util.Random;

public class Camarero extends Thread{

		/** estrucura que compare y va a sincronizar **/
		Comanda lacomanda = new Comanda(4);
		
		public Camarero(Comanda q) {
			lacomanda = q;
		}
		
		/**
		 * Hilo que va a ir consumiendo los datos producidos en la estructura, 
		 * ES EL CONSUMIDOR DE ENTEROS
		 */
		public void run() {
			
			try {
				Random aleat = new Random();
				Integer res ;

				int tiempo = aleat.nextInt(2)*1000;
				System.err.println("soy " + this.getName() + " voy a dormir " + tiempo);
				sleep(tiempo); // espero un tiempo aleatorio
				// como la pila es compartida, sincronizo su acceso
				synchronized (lacomanda) {
					// poll es retirar un elemento de la estructura
					while (lacomanda.estaVacia()) {
						// es porque no hay datos --> me espero a que me avisen de que hay datos
						System.err.println("Pila vacía, voy a parar, y soy " + this.getName());
						lacomanda.wait();
					}
					res=lacomanda.sacar();
					System.err.println("consumo " + res + " soy " + this.getName());
					lacomanda.notifyAll(); // notifico que he consumido un dato
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

}
