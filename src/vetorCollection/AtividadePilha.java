package vetorCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class AtividadePilha {

	public static void main(String[] args) {

		Deque<String> pilha = new ArrayDeque<String>();

		Scanner leia = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("\n------------MENU------------");
			System.out.println("\n1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("\nDigite uma opção:");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:
				System.out.print("Digite o nome:");
				String nome = leia.nextLine();

				pilha.push(nome);

				System.out.println("\nPilha:");
				for (String livro : pilha) {
					System.out.println(livro);
				}

				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.print("A Pilha está vazia!");
					System.out.print("\n");
				} else {
					System.out.println("Lista de Livros na Pilha:");
					for (String livro : pilha) {
						System.out.print("\n");
						System.out.println(livro);

					}
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.print("A Pilha está vazia!");
					System.out.print("\n");

				} else {
					pilha.pop();

					System.out.println("\nPilha:");
					for (String livro : pilha) {
						System.out.print("\n");
						System.out.print(livro);

					}

					System.out.println("\nUm Livro foi retirado da pilha!");
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
