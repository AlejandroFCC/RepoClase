import java.util.ArrayList;

public class Main {
	
	/*14. Tenemos una lista de todas las temperaturas m�ximas que se han dado cada d�a en Zaragoza los
		�ltimos 10 a�os. Las tenemos guardadas en un array de enteros. Tendremos que encontrar la
		temperatura m�xima de los �ltimos 10 a�os. Para ello primero simular las temperaturas
		llenando un array de 3.650 posiciones y la llenaremos de forma aleatoria con n�meros enteros,
		tomando valores entre -30 y 50. Para encontrar la temperatura m�s alta, dividiremos el array en
		partes y crearemos tantos hilos como partes hemos creado. Cada hilo deber� buscar dentro del
		array asignado cu�l es la temperatura m�s alta. Para finalizar, una vez encontrado el m�ximo de
		cada subconjunto del array , nos dir� cu�l es el n�mero m�ximo de los devueltos por cada hilo*/
	private static final int TEMPERATURAMIN = -30;
	private static final int TEMPERATURAMAX = 5000;
	private static final int DIAS = 3650;
	private static final int NUMHILOS = 10;
	
	public static void main(String[] args) {
		
		int[] dias = new int[DIAS]; 
		for (int i = 0; i < dias.length; i++) {
			dias[i]= TEMPERATURAMIN +(int)(Math.random()*((TEMPERATURAMAX-(TEMPERATURAMIN)) + 1));//int ii = -min + (int) (Math.random() * ((max - (-min)) + 1));
		//System.out.println(dias[i]);
		}
		
		temperaturaMaxima tm = new temperaturaMaxima(TEMPERATURAMIN);
		
		int rangoATrabajar = DIAS/NUMHILOS;
		int rangoSobrante = DIAS%NUMHILOS;
		
		int comienzo=0;
		ArrayList<BuscadoresDeTemperatura> Buscadores= new ArrayList<BuscadoresDeTemperatura>();
		for (int i = 0; i < NUMHILOS; i++) {
			Buscadores.add(new BuscadoresDeTemperatura(dias, comienzo, comienzo+rangoATrabajar, tm));
			comienzo=comienzo+rangoATrabajar;
		}
		if(rangoSobrante>0) {
			Buscadores.add(new BuscadoresDeTemperatura(dias, comienzo, rangoATrabajar, tm));
		}
		for (int i = 0; i < Buscadores.size(); i++) {
			Buscadores.get(i).start();
		}
		
		for (BuscadoresDeTemperatura hilospasados: Buscadores) {
			try {
				hilospasados.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < Buscadores.size(); i++) {
			//Buscadores.get(i).getName();
			//Buscadores.get(i).getTempMax();
			System.out.println("Hola, soy el buscador: "+Buscadores.get(i).getName()+" Mi temperatura maxima encontrada es: "+Buscadores.get(i).getTempMax());
		}
		
		System.out.println("la temperatura maxima: "+tm.gettemperaturaMaxima());
	}
	
	
}
