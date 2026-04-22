package lacoscondicionais;

import java.util.Scanner;

public class LacoCondicionalIf1 {

	public static void main(String[] args) {

		float A, B, C;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número A: ");
		A = leia.nextFloat();

		System.out.println("Digite o número B: ");
		B = leia.nextFloat();

		System.out.println("Digite o número C: ");
		C = leia.nextFloat();

		float soma = A + B;

		if (soma > C) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < C) {
			System.out.println("A Soma de A + B é Menor do que C");
		}

		else {
			System.out.println("A Soma de A + B é Igual a C");
		}

		leia.close();
	}
}
