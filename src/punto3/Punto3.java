
package punto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto3 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA CALCULA LA HIPOTENUSA DE UN TRI�NGULO\n");

		// Se declara un objeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Declaraci�n de las variables
		double cateto1, cateto2, hipotenusa;

		// Se asignan las variables pidiendolas al usuario
		System.out.print("\tIngrese la longitud de un cateto: ");
		cateto1 = Double.parseDouble(in.readLine());
		System.out.print("\tIngrese la longitud del otro cateto: ");
		cateto2 = Double.parseDouble(in.readLine());

		// Asignaci�n de la hipotenusa
		hipotenusa = Math.round((Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)))) * 100) / 100.0;

		// Salida por pantalla
		if (cateto1 <= 0 || cateto2 <= 0) {
			System.out.print("\n\tIngresa longitudes positivas o mayores que cero");
		} else {
			System.out.println("\n\tLas medidas del tri�ngulo son: \n\n" + "\tCateto N�1: " + cateto1
					+ "\n\tCateto N�2: " + cateto2 + "\n\n\tY el valor de la hipotenusa es: " + hipotenusa);
		}
	}
}
