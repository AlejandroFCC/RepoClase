package cafeteria;

public class Cuenta {
	//1
	private int cuenta;
	private int atendidos=0;
	
	//2 y 3
	public synchronized void sumarCuenta(int cantidad) {
		cuenta=cuenta+cantidad;
		atendidos++;
	}
	
	//4
	public int getCuenta() {
		return cuenta;
	}
	public int getAtendidos() {
		return atendidos;
	}
}
