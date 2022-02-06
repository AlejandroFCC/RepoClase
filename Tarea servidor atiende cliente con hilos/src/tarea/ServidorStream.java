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
import java.util.ArrayList;
import java.util.Iterator;


public class ServidorStream {
	
	public static final int clientes =3;
	//public static final int puerto =15000;

	public static void main(String[] args) {
		int puerto =11000;
	
		ServerSocket miServidor;
		try {
			miServidor = new ServerSocket(puerto);
			System.out.println("SERVIDOR: Escuchando por el puerto " + puerto);
			miServidor.setSoTimeout(0);

			for (int i = 0; i < clientes; i++) {
				
				Socket cliente = miServidor.accept();

				HiloSv hilo = new HiloSv(cliente);
				hilo.start();
				hilo.join();
				//escribirAlCliente.close();
				//leeCliente.close();
			}
			miServidor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}	
