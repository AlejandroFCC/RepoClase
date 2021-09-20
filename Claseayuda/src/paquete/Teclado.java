package paquete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Clase Teclado con operaciones de lectura de datos (entero, real, cadena de carácteres) 
// desde el teclado mediante flujos de caracteres.
public class Teclado {
	// Solicita al usuario la introducción de un n�mero entero 'int' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el n�mero entero leído desde el teclado.
	public static int solicitarEntero(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int numeroEntero = 0;
		boolean error = true; 
		while (error) {
			try {
				System.out.print(mensaje);
				numeroEntero = Integer.parseInt(teclado.readLine());
				error = false;
			} catch (NumberFormatException nfe) {
				System.out.println("El dato introducido no tiene formato de número entero.");
				error = true;
			} catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return numeroEntero;
	}

	// Solicita al usuario la introducción de un n�mero entero 'int' positivo por
	// teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el número entero positivo leído desde el teclado.
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
			} catch (NumberFormatException nfe) {
				System.out.println("El dato introducido no tiene formato de número entero.");
				error = true;
			} catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return numeroEnteroPositivo;
	}

	// Solicita al usuario la introducción de un número real 'float' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el número real en simple precisión leído desde el teclado.
	public static float solicitarRealEnSimplePrecision(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		float numeroRealEnSimplePrecision = 0.0F;
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				numeroRealEnSimplePrecision = Float.parseFloat(teclado.readLine());
				error = false;
			} catch (NumberFormatException nfe) {
				System.out.println("El dato introducido no tiene formato de número real.");
				error = true;
			} catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return numeroRealEnSimplePrecision;
	}

	// Solicita al usuario la introducción de un número real 'double' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el número real en doble precisión leído desde el teclado.
	public static double solicitarRealEnDoblePrecision(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		double numeroRealEnDoblePrecision = 0.0D;
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				numeroRealEnDoblePrecision = Double.parseDouble(teclado.readLine());
				error = false;
			} catch (NumberFormatException nfe) {
				System.out.println("El dato introducido no tiene formato de número real.");
				error = true;
			} catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return numeroRealEnDoblePrecision;
	}

	// Solicita al usuario la introducción de un carácter 'char' por teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve el carácter leído desde el teclado.
	public static char solicitarCaracter(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String cadenaConCaracter = "";
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				cadenaConCaracter = teclado.readLine();
				while (cadenaConCaracter.length() != 1) {
					System.out.println("El dato introducido debe ser un único carácter.");
					System.out.print(mensaje);
					cadenaConCaracter = teclado.readLine();
				}
				error = false;
			} catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return cadenaConCaracter.charAt(0);
	}

	// Solicita al usuario la introducción de una cadena de caracteres 'String' por
	// teclado:
	// - Visualiza en la consola un mensaje informativo para el usuario.
	// - Devuelve la cadena de caracteres leída desde el teclado.
	public static String solicitarCadena(String mensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String cadenaDeCaracteres = "";
		boolean error = true;
		while (error) {
			try {
				System.out.print(mensaje);
				cadenaDeCaracteres = teclado.readLine();
				error = false;
			} catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
				error = true;
			}
		}
		return cadenaDeCaracteres;
	}

	public static String validarEmail(String mensaje) {
		/*
		 * 
		 */
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String email = "";
		boolean error = true;
		while (error) {
			try {
				System.out.println(mensaje);
				email = teclado.readLine();

				Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				Matcher mather = pattern.matcher(email);

				if (mather.find()) {
					System.out.println("La direccion de correo es correcta");
					error = false;
				} else {
					System.out.println("La direccion de correo es incorrecta");
				}
			} catch (IOException ioe) {
				System.out.println("Se ha producido un error de entrada/salida.");
			}
		}
		return email;
	}

	public static boolean comprobarDni(String dnipasado) {
		/*
		 * 
		 */
		boolean validador = false;
		String dniValidado = "";
		int dniNum;
		int indiceLetra;

		dnipasado = dnipasado.toUpperCase();
		dniNum = Integer.parseInt(dnipasado.substring(0, 8));
		dniNum /= 23;
		dniNum *= 23;
		indiceLetra = Integer.parseInt(dnipasado.substring(0, 8)) - dniNum;

		char[] letraDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E', 'O' };

		dniValidado = dnipasado.substring(0, 8) + letraDni[indiceLetra];
		if (dniValidado.equals(dnipasado)) {
			validador = true;
		}
		return validador;
	}

	public static String validarDni(String mensaje) {
		/*
		 * 
		 */
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String dniPedido = "";
		String dniDevuelto=null;
		do {
			System.out.println(mensaje);
			try {
				dniPedido = teclado.readLine();
				if (dniPedido.length() == 9) {
					if (comprobarDni(dniPedido)) {
						System.out.println("El dni es correcto.");
						dniDevuelto=dniPedido.toUpperCase();
					} else {
						System.out.println("Error, el dni es incorrecto.");
					}
				} else {
					System.out.println("Tienes que darme minimo 9 caracteres por favor.");
				}
			} catch (IOException e) {
				System.out.println("Error el dni que me has dado no es valido.");
			}
		} while (dniPedido.length() != 9 || !comprobarDni(dniPedido));
		return dniDevuelto;
	}
}
