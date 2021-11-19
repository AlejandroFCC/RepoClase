package alternativastop3;

import java.util.Scanner;

public class alternativa3 {

	private static Thread hilo = null;

	public static void main(String[] args) {

		
		HiloSimple hs = new HiloSimple();
		hs.start();
		
		Scanner sc = new Scanner(System.in);
		hs.isInterrupted();

	}

}
