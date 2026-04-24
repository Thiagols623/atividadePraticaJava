package lacoRepeticao;

import java.util.Scanner;

public class LacoRepeticaoFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo ");
		int numero1 = leia.nextInt();

		System.out.println("\nDigite o último número do intervalo ");
		int numero2 = leia.nextInt();

		if (numero1 >= numero2) {
			System.out.println("\nIntervalo inválido!");
		} else {

			System.out.println("No intervalo entre " + numero1 + " e " + numero2 + ":");

			for (int contador = numero1; contador <= numero2; contador++) {

				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é multiplo de 3 e 5");
				}
			}
		}

		leia.close();

	}

}
