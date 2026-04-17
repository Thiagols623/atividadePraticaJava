package atividadePratica;

import java.util.Scanner;

public class salarioAbono  {
   
	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float salario, abono, novoSalario;

        System.out.print("Digite o salário: ");
        salario = leia.nextFloat();

        System.out.print("Digite o abono: ");
        abono = leia.nextFloat();

        novoSalario = salario + abono;

        System.out.println("Novo Salário: " + novoSalario);

    }
}
