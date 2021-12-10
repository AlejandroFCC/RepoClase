package Package;

public class Comanda {
	
		
		int[] array;
		int size = 4;
		private int last=0;
		
		/**
		 * Constructor
		 * @param size	Tama�o de la pila
		 */
		public Comanda(int size) {
			this.size = size;
			array = new int[size];
			last = 0;
		}
		
		/**
		 * A�ade un entero a la pila
		 * @param dato entero que se cargar� en la pila
		 * @return true si lo ha a�adido con �xito, false en otro caso
		 */
		public boolean agnade (int dato) {
			if (!estaLlena()) {
				array[last] = dato;
				last++;
				return true;
			}
			return false;
		}

		/**
		 * Retira un entero de la pila
		 * @return el �ltimo entero de la pila, -1 si no hay m�s datos la pila
		 */
		public int sacar () {
			if (!estaVacia()) {
				last--;
				return array[last];
			}
			return -1;
		}
		
		/**
		 * Vac�a la pila
		 */
		public void vaciar() {
			last = 0;
		}

		/**
		 * Chequea si la pila est� vac�a
		 * @return True si la pila est� vac�a, false en otro caso
		 */
		public boolean estaVacia() {
			if (last < 1) return true;
			return false;
		}

		/**
		 * Chequea si la pila est� llena
		 * @return	True si la pila est� llena, false en otro caso
		 */
		public boolean estaLlena() {
			if (last == size) {
				return true;
			}
			return false;
		}

}
