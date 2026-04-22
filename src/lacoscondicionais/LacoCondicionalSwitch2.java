package lacoscondicionais;

import java.util.Scanner;

public class LacoCondicionalSwitch2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Nome do colaborador: ");
		String nome = leia.nextLine();

		System.out.print("Cargo (código 1 a 6): ");
		int codigo = leia.nextInt();

		System.out.print("Salário: ");
		float salario = leia.nextFloat();

		String cargo = "";
		float reajuste = 0;

		switch (codigo) {

		case 1:
			cargo = "Gerente";
			reajuste = 0.10f;
			break;

		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;

		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;

		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;

		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;

		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			break;

		default:
			System.out.println("Código de cargo inválido!");
			leia.close();
			return;
		}

		float novoSalario = salario + (salario * reajuste);

		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salário: R$ %.2f%n", novoSalario);

		leia.close();

	}

}
