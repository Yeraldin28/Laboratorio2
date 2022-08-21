
package punto4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto4 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA VERIFICA SI UN N�MERO ES PAR O IMPAR\n");

		// Se declara un objeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Declaraci�n de las variables
		int numero;

		// Se asignan las variables pidiendolas al usuario
		System.out.print("\tIngrese el n�mero a verificar: ");
		numero = Integer.parseInt(in.readLine());

		// Salida por pantalla
		if (numero % 2 == 0) {
			System.out.println("\n\tEl n�mero " + numero + " es par");
		} else {
			System.out.println("\n\tEl n�mero " + numero + " es impar");
		}
	}
}
