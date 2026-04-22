package atividadepratica;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

        System.out.print("Salário Bruto: ");
        salarioBruto = leia.nextFloat();

        System.out.print("Adicional Noturno: ");
        adicionalNoturno = leia.nextFloat();

        System.out.print("Horas Extras: ");
        horasExtras = leia.nextFloat();

        System.out.print("Descontos: ");
        descontos = leia.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.println("Salário Líquido: " + salarioLiquido);

        leia.close();

	}

}
