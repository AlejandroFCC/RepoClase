package Package;

public class Main extends Thread{
	
	public static void main(String[] args) {
		Main hilo = new Main();
		//hilo.setPriority(8);antes del start si que le cambia la prioridad (mirar por que)
		hilo.start();
		System.out.println("Saludos desde el main");
		
		hilo.getId();
		hilo.getName();
		hilo.getPriority();
		System.out.println("mi id es: "+hilo.getId()+" mi nombre es: "+hilo.getName()+" mi prioridad es: "+hilo.getPriority());
		
		System.out.println(hilo.toString());
		String Nombre2 = "hilo1000";
		hilo.setName(Nombre2);
		hilo.setPriority(6);
		hilo.setPriority(hilo.MAX_PRIORITY);
		hilo.setPriority(hilo.MIN_PRIORITY);
		
		System.out.println("mi id sigue siendo el mismo: "+hilo.getId()+" mi nuevo nombre es: "+hilo.getName()+" mi prioridad es: "+ hilo.getPriority());
		
		System.out.println(hilo.toString());
	}
	
	public void run() {
		System.out.println("Saludos desde el nuevo hilo");
		
	}

}
