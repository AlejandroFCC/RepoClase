package tarea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class HiloCliente  extends Thread{

	Socket misocket;

	public HiloCliente(Socket misocketpasado) {
		this.misocket=misocketpasado;
	}
	
	public void run() {
		try {
			//leyendo
			InputStream lecturaSocket = misocket.getInputStream();
			InputStreamReader lector = new InputStreamReader(lecturaSocket);
			BufferedReader leeServidor = new BufferedReader(lector);
			String mensajeServidor = leeServidor.readLine();
			int idAMultiplicar= Integer.parseInt(mensajeServidor.substring(33,35));
			
			System.out.println(mensajeServidor);
			//System.out.println(idAMultiplicar);
			System.out.println("Cliente: multiplico mi id "+idAMultiplicar+" y lo paso multiplicado por 7 que es: "+idAMultiplicar*7);

			// envío algo al servidor
			OutputStream escrituraSocket = misocket.getOutputStream();
			OutputStreamWriter escritor = new OutputStreamWriter(escrituraSocket);
			BufferedWriter escribirAlServidor = new BufferedWriter(escritor);
			escribirAlServidor.write(""+idAMultiplicar*7);
			escribirAlServidor.newLine();
			escribirAlServidor.flush();
			
			//nuevo mensaje del servidor			
			mensajeServidor = leeServidor.readLine();
			System.out.println(mensajeServidor);			
			
			escribirAlServidor.close();
			leeServidor.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
