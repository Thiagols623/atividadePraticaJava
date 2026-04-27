package vetorCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("--------MENU--------");
			System.out.println("\n1 - Adicionar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Chamar Cliente");
			System.out.println("0 - Sair");
			System.out.print("\nDigite uma opção: ");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:
				System.out.print("Digite o nome: ");
				String nome = leia.nextLine();

				fila.add(nome);

				System.out.println("\nFila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}

				System.out.println("Cliente Adicionado!");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("\nLista de Clientes na Fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					fila.poll();

					System.out.println("\nFila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}

					System.out.println("O Cliente foi Chamado!");
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		leia.close();
	}

}
