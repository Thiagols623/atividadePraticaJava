package vetorCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AtividadeSet {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

      
        Set<Integer> numeros = new HashSet<>();

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);


        System.out.print("Digite o número que você deseja encontrar: ");
        int numeroBuscado = leia.nextInt();

     
        if (numeros.contains(numeroBuscado)) {
            System.out.println("\nO número " + numeroBuscado + " foi encontrado!");
        } else {
            System.out.println("\nO número " + numeroBuscado + " não foi encontrado!");
        }

        leia.close();
    }
}