

package punto5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto5 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA VERIFICA SI UN N�MERO ES PRIMO\n");

		// Se declara un objeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Declaraci�n de las variables
		int numero;

		// Se asignan las variables pidiendolas al usuario
		System.out.print("\tIngrese el n�mero a verificar: ");
		numero = Integer.parseInt(in.readLine());

		// Salida por pantalla

		if (numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0 && numero % 11 != 0
				&& numero % 13 != 0 && numero != 1 || numero == 2 || numero == 3 || numero == 5 || numero == 7
				|| numero == 11 || numero == 13) {
			System.out.print("\n\tEl n�mero " + numero + " es primo");
		} else {
			System.out.print("\n\tEl n�mero " + numero + " no es primo");
		}

	}
}
