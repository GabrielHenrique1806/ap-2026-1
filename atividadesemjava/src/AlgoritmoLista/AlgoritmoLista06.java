package AlgoritmoLista;//Escrever um algoritmo que leia dois valores distintos inteiros e informe qual é o maior e diga se este número maior está no intervalo entre 1 a 99 100 e 199 ou maior que 200.

import java.util.Scanner;

public class AlgoritmoLista06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        int valorUm, valorDois, maior;

        // Recebimento de dados

        System.out.print("Insira o primeiro valor: ");
        valorUm = leia.nextInt();

        System.out.print("Insira o segundo valor: ");
        valorDois = leia.nextInt();

        // Processamento - Definição do maior

        if(valorUm > valorDois) {
            maior = valorUm;
            System.out.println("O número maior é o primeiro valor: " + maior);
        }
        else if(valorUm < valorDois) {
            maior = valorDois;
            System.out.println("O número maior é o segundo valor: " + maior);
        }
        else {
            maior = valorUm;
            System.out.println("Os números são iguais: " + maior);
        }

        // Definição do intervalo

        if (maior >= 0 && maior <= 99) {
            System.out.println("O valor definido como maior " + maior + " está no intervalo entre 1 a 99");
        } else if (maior > 99 && maior <= 199) {
            System.out.println("O valor definido como maior " + maior + " está no intervalo entre 100 a 199");
        }
        else {
            System.out.println("O valor definido como maior " + maior + " está no intervalo dos m1aiores que 200");
        }
    }
}
