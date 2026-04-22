package lacoscondicionais;

import java.util.Scanner;

public class LacoCondicionalIf2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = leia.nextInt();

		String tipoNumero;
		if (numero % 2 == 0) {
			tipoNumero = "par";
		} else {
			tipoNumero = "ímpar";
		}

		String sinal;
		if (numero >= 0) {
			sinal = "positivo";
		} else {
			sinal = "negativo";
		}

		System.out.println("O Número " + numero + " é " + tipoNumero + " e " + sinal + "!");

		leia.close();
	}
}
