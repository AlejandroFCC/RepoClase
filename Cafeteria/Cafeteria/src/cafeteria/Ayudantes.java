package cafeteria;

public class Ayudantes extends Thread{
	private int[]array;
	private int desde;
	private int hasta;
	Cuenta c;
	
	//1-Constructor
	Ayudantes (int []array, int desde, int hasta, Cuenta cuenta){
		this.array=array;
		this.desde=desde;
		this.hasta=hasta;
		this.c=cuenta;
	}
	
	
	//2-run de cada hilo - leera la parte del array designado
	public void run() {
		for(int i=desde;i<hasta;i++) {
			c.sumarCuenta(array[i]);
//			//Durara mucho mas tiempo en ejecucion - esperara por cada ciclo	
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
