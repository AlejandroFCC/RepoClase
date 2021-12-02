
public class BuscadoresDeTemperatura extends Thread {

	private int[] dias;
	private int nInicio;
	private int nFinal;
	temperaturaMaxima temp;
	private int tempMax;

	public BuscadoresDeTemperatura(int[] diasPasados, int nInicioPasado, int nFinalPasado, temperaturaMaxima t) {
		this.dias = diasPasados;
		this.nInicio = nInicioPasado;
		this.nFinal = nFinalPasado;
		this.temp = t;
	}
	
	
	public int getTempMax() {
		return tempMax;
	}


	public void run() {

		tempMax = dias[nInicio];
		for (int i = nInicio; i < nFinal; i++) {
			if (dias[i] > tempMax) {
				tempMax = dias[i];
			}

		}
		//System.out.println("soy el Buscador: "+BuscadoresDeTemperatura.this+" , Mi temperatura maxima es: " + tempMax);
		temp.setTemperaturaFinal(tempMax);
	}
}
