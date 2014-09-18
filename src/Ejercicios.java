import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try
		{
			PrintWriter escritor = new PrintWriter ("nombre_archivo","UTF-8");
			escritor.write(contenido);
			escritor.flush();
		}catch(Exception e1)
		{
			
		}
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		try
		{
			PrintWriter escritor = new PrintWriter ("nombre_archivo","UTF-8");
			escritor.write(contenido);
			escritor.flush();
		}catch(Exception e)
		{
			
		}
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		try
		{
			File archivo = new File("nombre_archivo");
			Scanner s = new Scanner (nombre_archivo);
			int integer = 0;
			while(s.hasNextInt())
				System.out.println(integer);
		}catch(Exception e)
		{
			
		}
		return 0;
		
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		try
		{
		File archivo = new File("nombre_archivo");
		Scanner s = new Scanner(nombre_archivo);
		String primerstr = "";
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
		{
		File archivo = new File("nombre_archivo");
		Scanner s = new Scanner(nombre_archivo);
		double primerdouble = 0.0;
		while(s.hasNextDouble())
			System.out.print(primerdouble);
		}catch(Exception e)
		{
			
		}
		return 0.0;
	}
	//Devuelve si el archivo con nombre nombre_archivo contiene la string buscada
	static boolean existe(String nombre_archivo, String buscada)
	{
		try
		{
		File archivo = new File("nombre_archivo");
		Scanner s = new Scanner(nombre_archivo);
		while(s.hasNext())
		{
			System.out.print(s.next());
		}
		}catch(Exception e)
		{
			
		}
		return false;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMenor(String nombre_archivo)
	{
		try
		{
			File archivo = new File("nombre_archivo");
			Scanner s = new Scanner (archivo);
			int menor = 1000000;
			while(s.hasNextInt())
			{
				int num = s.nextInt();
				if(num < menor)
					menor = num;
			}
		}catch(Exception e)
		{
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
