package paquete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Generador {
	
	public static String tituloAzar() {
		Random azar= new Random();
		
		String tituloAzar[]= {"El Humor de mi vida", "Sira", "Batman/Fortnite: Punto cero n�m. 02 de 6", "Batman/Fortnite: Punto cero n�m. 01 de 6", "Castellano",
				"Castellano","El olvido que seremos","El infinito en un junco","El juego del alma","El arte de enga�ar al karma","Boulevard","El reino","Independencia",
				"Transbordo en Mosc�","A trav�s de mi ventana","Una herencia peligrosa (Amanda Black 1)","Anna Kadabra 6. Pasteles peligrosos",
				"Anna Kadabra 1. El Club de la Luna Llena","GUARDIANES DE LA NOCHE 21 ED. ESPECIAL","Heist","Los Futbol�simos 19: El misterio de las brujas futbolistas",
				"Alas de plata","El Principito","La anomal�a","El d�a que se perdi� la cordura (campa�a verano -edici�n limitada a precio especial)",
				"Tom�s Nevinson","Federico","Cocina de resistencia","Reina roja","El mundo de la Antig�edad tard�a",
				"Los Compas y el diamantito legendario (nueva presentaci�n)","Jujutsu kaisen 7","Sombra y hueso","El Evangelio","Breve tratado sobre la estupidez humana",
				"Un trozo de cielo azul","My Hero Academia n� 01","Feria","Panza de burro","Un cuento perfecto"};
		return tituloAzar[azar.nextInt(tituloAzar.length)];
	}
	
	public static String nombreAzar(){
		Random azar= new Random();
		
		String nombreAzar[]={"Hugo","Luc�a","Mart�n","Sof�a","Lucas","Martina","Mateo","Mar�a","Leo","Julia","Daniel","Paula","Alejandro","Emma",
			"Pablo","Daniela","Manuel","Valeria","�lvaro","Alba","Adri�n","Sara","David","Noa","Mario","Carmen","Enzo","Carla","Diego","Alma",
			"Marcos","Claudia","Izan","Valentina","Javier","Vega","Marco","Lara","�lex","Olivia","Bruno","M�a","Oliver","Aitana","Miguel","Lola",
			"Thiago","Chloe","Antonio","Ana","Marc","Alejandra","Carlos","Abril","�ngel","Jimena","Juan","Elena	","Gonzalo","Laia"};
		
		return nombreAzar[azar.nextInt(nombreAzar.length)];
	}
	
	static public String apellidoAzar(){
		Random azar= new Random();

		String apellidoAzar[]={"Abad�a","Abarca","Abell�n","Abiego","Acorella","Baldovinos","Bandr�s","Cabra","Cajal","Calasanz",
				"Samper","Latorre", "Escolano", "Cebri�n", "Clemente", "Navarro","Garc�a","Hern�ndez","Mart�nez","L�pez",
				"P�rez","Fern�ndez","Ruiz","S�nchez","Rodr�guez","G�mez","Gonz�lez","Jim�nez","Cruz","Requena","Moreno","Reyes",
				"Morillas","Cortes","Ortiz","Romero","Medialdea","Exp�sito","Raya","Sierra","Membrilla","Casado","Amezcua","Mu�oz",
				"Santiago","Delgado","Moya","Serrano","Contreras","Hidalgo","Mesa","Pozo","Soria","Vera","Var�n","Parra"};

		return apellidoAzar[azar.nextInt(apellidoAzar.length)];
	}
	
	static public String marcaAzar(){
		Random azar= new Random();
		String marcaAzar[]={"Apple","Google","Coca-Cola","Microsoft","IBM","Toyota","Samsung","GE","McDonald�s","Amazon",
				"BMW","Mercedes-Benz","Disney","Intel","Cisco","Oracle","Nike","HP","Honda","Louis Vuitton","H&M","Gillette",
				"Facebook","Pepsi","American Express","SAP","IKEA","Pampers","UPS","Zara","Budweiser","eBay","J.P. Morgan",
				"Nescaf�","HSBC","Ford","Hyundai","Canon","Herm�s","Accenture","L�Or�al","Audi","Citi","Goldman Sachs",
				"Philips","AXA","Nissan","Gucci","Danone","Nestl�","Siemens","Allianz","Colgate","Porsche","Cartier",
				"Sony","3M","Morgan Stanley","Visa","adidas","Thomson Reuters","Discovery","Panasonic","Tiffany & Co.",
				"Starbucks","Adobe","Prada","Santander","Xerox","Caterpillar","Burberry","Kia","KFC","MasterCard",
				"Johnson & Johnson","Shell","Harley-Davidson","DHL","Sprite","Lego","John Deere","Jack Daniel�s",
				"Chevrolet","FedEx","Land Rover","Huawei","Heineken","MTV","Ralph Lauren","Johnnie Walker","Corona",
				"Smirnoff","Kleenex","Hugo Boss","PayPal","Mini","Mo�t & Chandon","Lenovo"};
				return marcaAzar[azar.nextInt(marcaAzar.length)];
				}
	
	static public String provinciaAzar(){
		Random azar= new Random();
		String provincia[]= {"Alava","Albacete","Alicante","Almer�a","Asturias","Avila","Badajoz","Barcelona","Burgos","C�ceres",
		              "C�diz","Santander","Castell�n","Ciudad Real","C�rdoba","La Coru�a","Cuenca","Gerona","Granada","Guadalajara",
		              "Guip�zcoa","Huelva","Huesca","Islas Baleares","Ja�n","Le�n","L�rida","Lugo","Madrid","M�laga","Murcia","Navarra",
		              "Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
		              "Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};
		return provincia[azar.nextInt(provincia.length)];
	}
	
	static public String comunidadAzar(){
		Random azar= new Random();

		String comunidad[] = {"Andaluc�a", "Arag�n", "Canarias", "Cantabria", "Castilla y Le�n", "Castilla-La Mancha", "Catalu�a", "Ceuta",
				"Comunidad Valenciana", "Comunidad de Madrid", "Extremadura", "Galicia", "Islas Baleares", "La Rioja", "Melilla", "Navarra", 
				"Pa�s Vasco", "Principado de Asturias", "Regi�n de Murcia"};

		return comunidad[azar.nextInt(comunidad.length)];
	}

	static public String dniAzar(){
		Random azar= new Random();
		String dni;
		String letra[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int numero, calculo;
		numero=azar.nextInt((99999999-10000000)+1)+10000000;
		calculo=numero%23;
		dni=numero+letra[calculo];
		return dni;
	}
	
	static public String validaDni(String DNI){
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";
		int num;
		String letra[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

		boolean error = true;
		while (error) {
			try {
				System.out.println(DNI);
				dato = dataIn.readLine();
				num = Integer.parseInt(dato.substring(0, 8));
				if(dato.substring(8, 9).toUpperCase().compareTo(letra[num%23])==0){
				error=false;
				}else{System.out.println("DNI erroneo");}
			} catch (IOException e) {
				System.out.println("Vuelve a inroducir el dato, por favor: ");
				error = true;
			}
		}
		return dato;
	}

	static public int enteroAzar(int desde, int hasta){
		Random azar= new Random();
		return azar.nextInt(hasta-desde+1)+desde;
	}

	static public double decimalAzar(int desde, int hasta){
		Random azar= new Random();
		return (azar.nextInt((int)((hasta-desde)*100+1))+desde*100) / 100.00;
	}
	
	

}
