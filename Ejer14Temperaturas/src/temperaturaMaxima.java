
public class temperaturaMaxima {
	
	private int temperaturaMaxima;

	public temperaturaMaxima(int temperaturaMaxima) {
		//super();
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public int gettemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public synchronized void setTemperaturaFinal(int temperaturaMaxima) {
		if (this.temperaturaMaxima < temperaturaMaxima)
			this.temperaturaMaxima = temperaturaMaxima;
	}

}
