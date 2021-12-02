package cafeteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Clase Teclado con operaciones de lectura de datos (entero, real, cadena de car�cteres) 
// desde el teclado mediante flujos de caracteres.
public class Teclado {
	// Solicita al usuario la introduccion de un n�mero entero 'int' positivo por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el n�mero entero positivo leido desde el teclado.
	public static int solicitarEnteroPositivo(String mensaje) {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            int numeroEnteroPositivo = 0;
            boolean error = true;
            while (error) {
                    try {
                            System.out.print(mensaje);
                            numeroEnteroPositivo = Integer.parseInt(teclado.readLine());
                            while (numeroEnteroPositivo <= 0) {
                                    System.out.println("El dato introducido debe ser mayor que cero.");
                                    System.out.print(mensaje);
                                    numeroEnteroPositivo = Integer.parseInt(teclado.readLine());
                            }
                            error = false;
                    } 
                    catch (NumberFormatException nfe) {
                            System.out.println("El dato introducido no tiene formato de numero entero.");
                            error = true;
                    }
                    catch (IOException ioe) {
                            System.out.println("Se ha producido un error de entrada/salida.");
                            error = true;
                    } 
            }
            return numeroEnteroPositivo;
	}
}