package lacoRepeticao;

import java.util.Scanner;

public class LacoRepeticaoFor2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int pares = 0;
		int impares = 0;

		for (int contador = 1; contador <= 10; contador++) {

			System.out.println("Digite o " + contador + "º numero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;

			}

		}

		System.out.println("Total de números pares " + pares);
		System.out.println("Total de números ímpares " + impares);

		leia.close();
	}

}
