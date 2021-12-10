package Package;

public class cocineros extends Thread {
	
	String ingrediente;

	public cocineros() {
	}
	
	
	public void run() {

		this.ingrediente=Cocina.cocinaPlato();
	
	}


	public String getIngrediente() {
		return ingrediente;
	}


	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	
}
