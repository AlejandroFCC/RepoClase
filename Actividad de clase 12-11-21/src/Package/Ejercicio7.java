package Package;

public class Ejercicio7 extends Thread{
	
	public static String name;
	public static void main(String[] args) {
		
		//Ejercicio7 hilo = new Ejercicio7();
		
		for (int i = 0; i < 100; i++) {
			Ejercicio7 hilo = new Ejercicio7();
			System.out.println("hola hilo "+i);
			name="hilo"+i;
			hilo.setName(name);
			hilo.start();
			
		}
	}
	
	@Override
	public void run() {
		
		System.out.println("hola Main, soy el hilo ");
	}

}
