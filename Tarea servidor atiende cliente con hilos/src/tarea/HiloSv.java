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


public class HiloSv extends Thread {
	Socket cliente;
	
	public HiloSv(Socket clientepasado) {
		this.cliente=clientepasado;
	}
	
	public void run() {
		
		int id=(int) (Math.random()*(99-(10))+1);
		
		try {
			
			System.out.println("Servidor: se ha conectado el cliente con id "+id);
			
			// envío algo al servidor
			OutputStream escrituraSocket = cliente.getOutputStream();
			OutputStreamWriter escritor = new OutputStreamWriter(escrituraSocket);
			BufferedWriter escribirAlCliente = new BufferedWriter(escritor);
			escribirAlCliente.write("Servidor: Eres el cliente con id="+id+",multiplica tu id por 7 y devuélvelo.");
			escribirAlCliente.newLine();
			escribirAlCliente.flush();
					
			//leyendo
			InputStream lecturaSocket = cliente.getInputStream();
			InputStreamReader lector = new InputStreamReader(lecturaSocket);
			BufferedReader leeCliente = new BufferedReader(lector);
			String mensajepasado = leeCliente.readLine();
			int comprobarIdMultiplicado = Integer.parseInt(mensajepasado);
			//System.out.println(comprobarIdMultiplicado);
			System.out.println("Servidor: El cliente con id "+id+" ha multiplicado su id por 7 y me ha pasado:  =>" + comprobarIdMultiplicado);
			if(comprobarIdMultiplicado==(id*7)) {
				System.out.println("Servidor: Ok");
				escribirAlCliente.write("Servidor: Ok");
				escribirAlCliente.newLine();
				escribirAlCliente.flush();
				cliente.close();
			}else {
				System.out.println("Servidor: Error, id pasado incorrecto");
				escribirAlCliente.write("Servidor: Error, id pasado incorrecto");
				escribirAlCliente.newLine();
				escribirAlCliente.flush();
			}
			 
			// cierro todos los recursos						
			//escribirAlCliente.close();
			//leeCliente.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
