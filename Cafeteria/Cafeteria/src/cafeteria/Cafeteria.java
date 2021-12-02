package cafeteria;

import java.util.Random;

public class Cafeteria {

	public static void main(String[] args) {
		//1- Inicio a contar el tiempo de ejecucion
		long inicio = System.currentTimeMillis();
		//Variables a utilizar
		int clientes=159, nAyudantes=0, atendidos=0, porAtender=0, desde=0, hasta=0;
		Random dinero=new Random();
		int numAzar;
		Cuenta cuenta=new Cuenta();
		
		
		//2-Pedir cantidad de ayudantes
		nAyudantes= Teclado.solicitarEnteroPositivo("Introduca la cantidad de ayudantes: ");
		while(nAyudantes>clientes) {
			if(nAyudantes>clientes) {
				System.out.println("Hay ayudantes innecesarios");
			}
			nAyudantes= Teclado.solicitarEnteroPositivo("Introduca la cantidad de ayudantes: ");
		}
		
		
		//3-Creacion del array de hilos y clientes
		Ayudantes []ayudantes= new Ayudantes[nAyudantes];
		int []Cliente=new int[clientes];
		
		
		//4-Relleno de clientes 
		for(int i=0;i<clientes;i++) {
			numAzar=dinero.nextInt((45-5+1)+5);
			Cliente[i]=numAzar;
		}

		
		//5-Cantidad de campos del array a leer
		atendidos=clientes/nAyudantes;
		porAtender=clientes%nAyudantes;
		
		
		//6-Creacion de hilos
		for(int i=0;i<nAyudantes;i++) {	
			hasta=hasta+atendidos;
			if(porAtender!=0) {//Repartimos el resto de 1 en 1 entre los primeros hilos
				hasta++;
				porAtender--;
			}
			ayudantes[i]=new Ayudantes(Cliente, desde, hasta, cuenta);
			desde=hasta;
		}
		
		
		//7-Iniciar Hilos
		for(int i=0;i<ayudantes.length;i++) {
			ayudantes[i].start();
		}
		
		
		//8-Esperar que todos los hilos finalizen
		for(int i=0;i<ayudantes.length;i++) {
			try {
				ayudantes[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		
		//9-Imprime resultado
		System.out.println();
		System.out.println("Clientes atendidos= "+cuenta.getAtendidos());
		System.out.println("Beneficios obtenidos= "+cuenta.getCuenta());
		//10-Termino de contar el tiempo de ejecucion
		long finale = System.currentTimeMillis();
		System.out.println("Dure "+(finale-inicio)/1000+"seg. en ejecución");
	}
}
