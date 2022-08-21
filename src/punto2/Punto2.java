
package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto2 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA CALCULA EL �REA DE UN C�RCULO\n");

		// Se declara un objeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Declaraci�n de las variables
		double radio, area;

		// Se asignan las variables pidiendolas al usuario
		System.out.print("\tIngrese la longitud del radio: ");
		radio = Double.parseDouble(in.readLine());

		// Asignaci�n del �rea
		area = Math.round((Math.pow(radio, 2) * Math.PI) * 100) / 100.0;

		// Salida por pantalla
		if (radio < 0) {
			System.out.println("\n\n\tIntroduce un n�mero positivo en el radio");
		} else {
			System.out.println("\tLas medidas del c�rculo son: \n\n" + "\tRadio: " + radio
					+ "\n\n\tY �rea del c�rculo es: " + area);
		}
	}
}
