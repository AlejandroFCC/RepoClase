package Package;

public class Restaurante {
	/*
	 * 15. En un restaurante hay un cocinero y un camarero. El cocinero no puede empezar a hacer
		pedidos hasta que el camarero no le notifique que tiene una. Por lo tanto el cocinero tendrá que
		esperar a tener un pedido para poder hacerla. Un camarero tarda unos 5 segundos a generar un
		pedido y los clientes van entrando en el restaurante de forma aleatoria. El cocinero sirve los
		platos cada 4 segundos. Debe desarrollar una aplicación que controle este sistema utilizando
		hilos. Es una implementación de productor-consumidor donde el productor (camarero) notifica
		al consumidor (cocinero) que tiene un ítem (pedido) para consumir
	*/
	
	public static void main(String[] args) {

		Comanda comanda = new Comanda(4);
		
		// durante 30 iteraciones crearemos un dato y lo consumiremos
		for (int i = 1; i <= 5; i++) {
			Cocinero p = new Cocinero(comanda, i);
			Camarero c = new Camarero(comanda);
			p.setName("productor" + i);
			c.setName("consumidor"+i);
			p.start();
			c.start();
		}
	}

}
