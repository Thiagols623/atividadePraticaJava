package vetorCollection;

import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroBuscado = leia.nextInt();

		int posicao = -1;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroBuscado) {
				posicao = i;
				break;
			}
		}

		if (posicao >= 0) {
			System.out.println("\nO número " + numeroBuscado + " está localizado na posição: " + posicao);
		} else {
			System.out.println("\nO número " + numeroBuscado + " não foi encontrado!");
		}

		leia.close();
	}
}