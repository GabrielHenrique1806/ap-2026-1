package AlgoritmoInicial;// Escreva um algoritmo e um fluxograma que receba dois números e exiba o resultado da sua soma.

import java.util.Scanner;

public class Algoritmo01_Soma {
    static void main() {
        Scanner leia = new Scanner(System.in);

        //Variáveis

        float numeroUm, numeroDois, resultado;

        //Recebimento de dados

        System.out.print("Insira o primeiro número: ");
        numeroUm = leia.nextFloat();

        System.out.print("Insira o Segundo número: ");
        numeroDois = leia.nextFloat();

        //Resultado

        resultado = numeroUm + numeroDois;
        System.out.print("O resultado da soma entre os números é: " + resultado);

    }
}
