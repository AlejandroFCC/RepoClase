package Package;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Main {
	  public static void main(String args[]) throws IOException {
		  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		  
			  String exit="exit";
			  //while(!teclado.readLine().equals(exit)) {
				   ProcessBuilder pb = new ProcessBuilder("CMD C/"+teclado.readLine());
				  
				   File fBat = new File("C:/paraexamenpsp/fichero.bat");
				   File fOut = new File("C:/paraexamenpsp/salida.txt");
				   File fErr = new File("C:/paraexamenpsp/error.txt");
				 
				    pb.redirectInput(fBat);
				    pb.redirectOutput(fOut);
				    pb.redirectError(fErr); 
				    /*System.out.println(pb.redirectInput());
				    System.out.println( pb.redirectOutput());
				    System.out.println(pb.redirectError());*/
				    pb.start();
			  //}
			  

		  }
	  
	  
	  /*public static void casa() {
	 		
	 		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	 		double numero1,numero2,resultado;
	 		
	 		try {
	 			numero1=Double.parseDouble(teclado.readLine());
	 			numero2=Double.parseDouble(teclado.readLine());
	 			resultado=numero1/numero2;
	 			System.out.println("la division de "+numero1+" entre "+numero2+" es: "+resultado);
	 			
	 		} catch (NumberFormatException nfe) {
	 			System.out.println("El dato introducido no tiene formato de numero");
	 		}catch (IOException ioe) {
	 			System.out.println("Se ha producido un error de entrada/salida.");
	 		}
	 		
	 	}*/

}
