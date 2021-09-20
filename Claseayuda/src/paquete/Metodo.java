package paquete;

import java.awt.Container;

/** 
 * Esta es mi clase de métodos personal
 * @author Víctor Gutiérrez
 * @version 08/04/2020
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.PatternSyntaxException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public abstract class Metodo {
	/**
	 * Pide un Integer
	 * @param Texto a mostrar en pantalla
	 * @return un Integer
	 */
	public static Integer getInt(String texto) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer val = null;
		Boolean error = true;
		while (error) {
			try {
				System.out.println(texto);
				val = null;
				val = Integer.parseInt(br.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Dato erroneo. Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;
	}
	/**
	 * Pide un Integer que se encuentre entre 2 números
	 * @param Limite inferior
	 * @param Limite superior
	 * @param Texto a mostrar en pantalla
	 * @return un Integer que se encuentre entre los 2 integers que se haya introducido con anterioridad
	 */
	public static Integer getIntBetween(int num1, int num2, String texto) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer val = null;
		Boolean error = true;
		while (error || (val < num1 || val > num2)) {
			try {
				System.out.println(texto);
				val = null;
				val = Integer.parseInt(br.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Dato erroneo. Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;
	}
	/**
	 * Pide un String
	 * @param Texto a mostrar en pantalla
	 * @return un String
	 */
	public static String getString(String texto) {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String val = null;
		Boolean error = true;
		while (error) {
			try {
				System.out.println(texto);
				val = null;
				val = br.readLine();
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			}
		}
		return val;
	}
	/**
	 * Pide un String con un contenido especificado
	 * @param Texto a mostrar en pantalla
	 * @param regex
	 * @return un String con el contenido especificado
	 */
	public static String getString(String texto, String regex) {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String val = null;
		Boolean error = true;
		while (error) {
			try {
				System.out.println(texto);
				val = null;
				val = br.readLine();
				if (regex == null) {
					error = false;
				} else {
					error=!val.matches(regex);
					if (error) {
						System.out.println("Por favor, vuelve a introducir el dato. El dato intorducido no es un valor posible.");
					}
				}
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (PatternSyntaxException e) {
				System.out.println("La expresion regular no es correcta");
				System.exit(0);
				error = false;
			}
		}
		return val;
	}
	/**
	 * Pide un String con un length() máximo limitado
	 * @param Límite de length()
	 * @param Texto a mostrar en pantalla
	 * @return un String cuyo length() no sera mayor que el limite.
	 */
	public static String getStringLim(int lim, String texto) {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String val = null;
		Boolean error = true;
		while (error || val.length() > lim) {
			try {
				System.out.println(texto + " (max " + lim + " chars)");
				val = null;
				val = br.readLine();
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			}
		}
		return val;
	}
	/**
	 * Dice si un número es primo
	 * @param Número a saber si es primo
	 * @return booleano que indicara si es primo o no
	 */
	public static Boolean numPri(int num) {
		Boolean pri = true;
		if (num == 1) pri = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				pri = false;
				break;
			}
		}
		return pri;
	}
	/**
	 * Pide un Integer positivo
	 * @param Texto a mostrar en pantalla
	 * @return un Integer positivo
	 */
	public static Integer getIntPos(String texto) {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Integer val = null;
		Boolean error = true;
		while (error || val < 0) {
			try {
				System.out.println(texto);
				val = null;
				val = Integer.parseInt(br.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;
	}
	
	/**
	 * Resuelve una operación de segundo grado
	 * @param Operando x^2
	 * @param Operando X
	 * @param Operando n
	 * @return Un array con los 2 resultados
	 */
	public static Integer[] equation2(int a, int b, int c) {
		Integer op1, op2, op3;
		op1 = (int) Math.pow(b, 2);
		op2 = 4 * a * c;
		op1 -= op2;
		op1 = (int) Math.sqrt(op1);
		op2 = a * 2;
		op1 = (-b + op1) / op2;
		op3 = (-b - op1) / op2;
		Integer res[] = {op1, op3};
		return res;
	}
	
	/**
	 * Pide un Boolean
	 * @param Texto a mostrar en pantalla
	 * @return un Boolean
	 */
	public static Boolean getBoolean(String texto) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Boolean res = null, error = true;
		String text;
		try {
			while (error) {
				System.out.println(texto);
				text = null;
				text = br.readLine();
				if (text.compareToIgnoreCase("true") == 0 || text.compareToIgnoreCase("false") == 0) {
					res = Boolean.parseBoolean(text);
					error = false;
				}	
			}
		} catch (Throwable e) {
			error = true;
		}
		return res;
	}
	/**
	 * Pide un Double positivo
	 * @param Texto a mostrar en pantalla
	 * @return un Double positivo
	 */
	public static Double getDoublePos(String texto) {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Double val = null;
		boolean error = true;
		while (error || val < 1) {
			try {
				System.out.println(texto);
				val = null;
				val = Double.parseDouble(br.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;
	}
	/**
	 * Pide un Character
	 * @param Texto a mostrar en pantalla
	 * @return un Character
	 */
	public static Character getChar(String texto) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Character car = null;
		Boolean error = true;
		while (error) {
			try {
				System.out.println(texto);
				car = null;
				car = (char)br.read();
				error = false;
			} catch (IOException e){
				System.out.println("Ha habido un error, vuelve a intentarlo.");
			}
		}
		return car;
	}
	/**
	 * Pide un Character equivalente a un género
	 * @param Texto a mostrar en pantalla
	 * @return un Character equivalente a un género
	 */
	public static Character getCharGender(String texto) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("unused")
		Character car = null, no;
		Boolean error = true;
		while (error) {
			try {
				System.out.println(texto);
				car = '0';
				car = (char)br.read();
				no = (char)br.read();
				no = (char)br.read();
				if (car == 'm' || car == 'f' || car == 'M' || car == 'F') {
					error = false;
				} else {
					error = true;
					System.out.println("Los datos de gï¿½nero valido son (m) para hombre y (f) para mujer");
				}
			} catch (IOException e){
				System.out.println("Ha habido un error, vuelve a intentarlo.");
			}
		}
		return car;
	}

	/**
	 * Devuelve la primera posición nula de un array
	 * @param Array de objetos
	 * @return la primera posición en la que se encuentre un nulo (un Integer == length si no hay ningun nulo)
	 */
	public static int nullFinder(Object[] arr) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				break;
			}
		}
		return i;
	}
	/**
	 * Imprime el contenido de un array de objetos
	 * @param Array de objetos
	 */
	public static void printArray(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.println(arr[i]);
			} else {
				break;
			}
		}
	}
	/**
	 * Intercambia dos posiciones en un array
	 * @param Array de objetos
	 * @param Una de las posiciones a intercambiar
	 * @param Otra de las posiciones a intercambiar
	 */
	public static void arrTransmut(Object[] arr, int n, int m){
		Object bak;
		bak = arr[n];
		arr[n] = arr[m];
		arr[m] = bak;
	}
	/**
	 * Intercambia dos posiciones en una lista
	 * @param List
	 * @param Una de las posiciones a intercambiar
	 * @param Otra de las posiciones a intercambiar
	 */
	@SuppressWarnings("unchecked")
	public static <E> void arrListTransmut(List<E> arr, int n, int m) {
		Object bak;
		bak = arr.get(n);
		arr.set(n, arr.get(m));
		arr.set(m, (E) bak);
	}
	
	/**
	 * Pide un entero contenido en un menú de opciones
	 * @param texto array de opciones
	 * @return opción del menú seleccionada
	 */
	public static Integer getIntMenu(String[] texto) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer val = null;
		Boolean error = true;
		String str = null;
		while (error || (val < 0 || val > texto.length - 1)) {
			try {
				for (int i = 0; i < texto.length; i++) {
					if(i != 0) {
						System.out.println("(" + i + ") " + texto[i]);
					} else {
						str = "(" + i + ") " + texto[i];
					}
				}
				System.out.println(str);
				val = null;
				val = Integer.parseInt(br.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Dato erroneo. Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;
	}
	
	/**
	 * Pide un entero contenido en un menú de opciones de una lista
	 * @param texto lista de opciones
	 * @return opción del menú seleccionada
	 */
	public static Integer getIntMenu(List<String> texto) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer val = null;
		Boolean error = true;
		String str = null;
		while (error || (val < 0 || val > texto.size() - 1)) {
			try {
				for (int i = 0; i < texto.size(); i++) {
					if(i != 0) {
						System.out.println("(" + i + ") " + texto.get(i));
					} else {
						str = "(" + i + ") " + texto.get(i);
					}
				}
				System.out.println(str);
				val = null;
				val = Integer.parseInt(br.readLine());
				error = false;
			} catch (IOException e) {
				System.out.println("Dato erroneo. Vuelve a introducir el dato, por favor.");
				error = true;
			} catch (NumberFormatException e) {
				System.out.println("El dato introducido no es entero.");
				error = true;
			}
		}
		return val;
	}
	
	/**
	 * Pide una hora por teclado
	 * @return Fecha compuesta por año, mes, día, hora y minuto
	 */
	public static Calendar getFecha() {
		int hora, min, dia, mes, anyo;
		int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Calendar date = Calendar.getInstance();
		anyo = Metodo.getIntBetween(2020, 2030, "Elige el año");
		mes = Metodo.getIntBetween(1, 12, "Elige el mes") - 1;
		if(anyo % 4 == 0 && mes == 1) {
			dia = Metodo.getIntBetween(1, 29, "Elige el día");
		} else {
			dia = Metodo.getIntBetween(1, dias[mes], "Elige el día");
		}
		hora = Metodo.getIntBetween(0, 23, "Elige la hora");
		min = Metodo.getIntBetween(0, 59, "Elige el minuto");
		date.set(anyo, mes, dia, hora, min);
		return date;
	}
	
	/**
	 * @param recibe como parámetro textoo
	 * @return Te muestra una ventanita en la cuál tienes que introducir verdadero o falso
	 */
	public static boolean getBooleanSwing(String texto) {
		boolean boo = false;
		int n;
		n = JOptionPane.showConfirmDialog(null, texto, null, JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.YES_OPTION) {
			boo = true;
		}
		
		return boo;
	}
	
	/**
	 * @param recibe como parámetro un vector de textos
	 * @return devuelve el array con los textos
	 */
	public static ArrayList<JButton> getBotones(String[] texto){
		ArrayList<JButton> botones = new ArrayList<>();
		for (int i = 0; i < texto.length; i++) {
			botones.add(new JButton(texto[i]));
		}
		return botones;
	}
	
	/**
	 * @param ArrayList con los botones
	 * @param el container host es el contenedor del que va a coger los parámetros
	 * @return
	 */
	public static GroupLayout getLayoutMenuSwing(ArrayList<JButton> botones, Container host) {
		GroupLayout grupo = new GroupLayout(host);
		ParallelGroup paralelo = grupo.createParallelGroup(Alignment.LEADING);
		SequentialGroup secuencial = grupo.createSequentialGroup();
		secuencial.addContainerGap(20, Short.MAX_VALUE);
		for (JButton jButton : botones) {
			paralelo.addComponent(jButton, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE);
		}
		grupo.setHorizontalGroup(
				grupo.createParallelGroup(Alignment.LEADING)
				.addGroup(grupo.createSequentialGroup()
						.addContainerGap()
						.addGroup(paralelo)
						.addContainerGap())
				);

		for (int i = 1; i < botones.size(); i++) {
			secuencial.addComponent(botones.get(i));
			secuencial.addPreferredGap(ComponentPlacement.RELATED);
		}
		secuencial.addComponent(botones.get(0));
		secuencial.addContainerGap();
		grupo.setVerticalGroup(
				grupo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, secuencial)
				);
		host.setLayout(grupo);
		return grupo;
	}
}
