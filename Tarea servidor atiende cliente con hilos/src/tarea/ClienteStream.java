package tarea;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class ClienteStream {
	public static final int clientes =3;
	
	public static void main(String[] args) {
		String host = "localhost";
		int puerto = 11000;
		
		// creamos el socket
		try {
			//Socket misocket = new Socket(host, puerto);
			
			ArrayList<HiloCliente> hilo=new ArrayList<>();
			
			for (int i = 0; i <= clientes; i++) {
				
				Socket misocket = new Socket(host, puerto);
				//HiloCliente hiloc= new HiloCliente(/*lector, escritor*/misocket);
				//hiloc.start();
				//hiloc.join();*/
				hilo.add(new HiloCliente(misocket));
				hilo.get(i).start();
				
			}
				
			for (HiloCliente hilospasados : hilo) {
				
				hilospasados.join();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
