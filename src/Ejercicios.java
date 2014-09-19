import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		//inicio el try
		try
		{
			// se inicializa el escritor de archivos y al archivo creado se le da el nombre de nombre_archivo
			PrintWriter escritor = new PrintWriter ("nombre_archivo","UTF-8");
			escritor.write(contenido);
			//se escribe la variable contenido
			escritor.flush();
		}catch(Exception e1)
		//captura cualquier exception
		{
			
		}
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		//inicio el try
		try
		{
			// se inicializa el escritor de archivos y al archivo creado se le da el nombre de nombre_archivo
			PrintWriter escritor = new PrintWriter ("nombre_archivo","UTF-8");
			escritor.write(contenido);
			//se escribe la variable contenido
			escritor.flush();
		}catch(Exception e1)
		//captura cualquier exception
		{
			
		}
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		//se inicia con el try
		try
		{
			// se inicializa un nuevo archivo que recibe el nombre de nombre_archivo
			File archivo = new File("nombre_archivo");
			// se lee el archivo
			Scanner s = new Scanner (nombre_archivo);
			//creo una variable int
			int integer = 0;
			//se seguira leyendo hasta encontrar el int 
			while(s.hasNextInt())
				System.out.println(integer);
		}catch(Exception e)
		//se captura cualquier exception
		{
			
		}
		return 0;
		
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		//se incia el try
		try

		{
			// se inicializa un nuevo archivo que recibe el nombre de nombre_archivo
			File archivo = new File("nombre_archivo");
			// se lee el archivo
			Scanner s = new Scanner (nombre_archivo);
			//creo una variable tipo String
			String primerstr = "";
			//el scanner seguira leyendo el archivo hasta encontrar el String
			while(s.hasNext())
				System.out.print(primerstr);
		}catch(Exception e)
		{
			
		}
		return "";
		
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		try
		//se incia el try
		{
			// se inicializa un nuevo archivo que recibe el nombre de nombre_archivo
			File archivo = new File("nombre_archivo");
			// se lee el archivo
			Scanner s = new Scanner (nombre_archivo);
			// creo una variable tipo double
			double primerdouble = 0.0;
			// el scanner leera hasta encontrar el primer double del archivo
			while(s.hasNextDouble())
				System.out.print(primerdouble);
		//se captura cualquier exception
		}catch(Exception e)
		{
			
		}
		return 0.0;
	}
	//Devuelve si el archivo con nombre nombre_archivo contiene la string buscada
	static boolean existe(String nombre_archivo, String buscada)
	{
		//se incia el try
		try
		{
			// se inicializa un nuevo archivo que recibe el nombre de nombre_archivo
			File archivo = new File("nombre_archivo");
			// se lee el archivo
			Scanner s = new Scanner (nombre_archivo);
			//se leera el archivo hasta encontrar el string buscado
			while(s.hasNext())
			{
				System.out.print(s.next());
			}
		//se captura cualquier exception
		}catch(Exception e)
		{
			
		}
		return false;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMenor(String nombre_archivo)
	{
		//se incia el try
		try
		{
			// se inicializa un nuevo archivo que recibe el nombre de nombre_archivo
			File archivo = new File("nombre_archivo");
			// se lee el archivo
			Scanner s = new Scanner (nombre_archivo);
			//creo una variable con un valor muy elevado
			int menor = 1000000;
			// el scanner leera el archivo comparando todos los elementos int con la variable establecida anteriormente
			while(s.hasNextInt())
			{
				int num = s.nextInt();
				if(num < menor)
					menor = num;
			}
		//se captura cualquier exception
		}catch(Exception e)
		{
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
