
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto1 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA CALCULA EL PER�METRO DE UN RECT�NGULO\n");

		// Se declara un objeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Declaraci�n de las variables
		double largo, ancho, perimetro, numeroDeApoyo;

		// Se asignan las variables pidiendolas al usuario
		System.out.print("\tIngrese el largo del rect�ngulo: ");
		largo = Double.parseDouble(in.readLine());

		System.out.print("\tIngrese el ancho del rect�ngulo: ");
		ancho = Double.parseDouble(in.readLine());

		// Asignaci�n del per�metro
		perimetro = Math.round(((2 * largo) + (2 * ancho)) * 100) / 100.0;

		// Confirmaci�n si las medidas est�n mal introducidas
		if (largo < ancho) {
			numeroDeApoyo = ancho;
			ancho = largo;
			largo = numeroDeApoyo;
		}

		// Salida por pantalla
		if (largo < 0 || ancho < 0) {
			System.out.println("\n\n\tIntroduce n�meros positivos en las medidas");
		} else {
			System.out.println("\tLas medidas introcucidas son: \n\n" + "\tLargo: " + largo + "\n\tAncho: " + ancho
					+ "\n\n\tY el per�metro es: " + perimetro);
		}
	}
}
