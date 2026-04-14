package AlgoritmoInicial;//Escreva um Algoritmo para demonstrar as operações matemáticas básicas e mostre o resultado para cada operador.

import java.util.Scanner;

public class Algoritmo03_Operacoes {
    static void main() {
        Scanner leia = new Scanner(System.in);

        //Variáveis

        float numero1, numero2, resultado;

        //Recebimento de dados

        System.out.print("Digite um número: ");
        numero1 = leia.nextFloat();

        System.out.print("Digite outro número: ");
        numero2 = leia.nextFloat();

        //Processamento + Resultados

        resultado = numero1 + numero2;
        System.out.println("A soma dos dois números é: " + resultado);

        resultado = numero1 - numero2;
        System.out.println("A subtração dos dois números é: " + resultado);

        resultado = numero1 * numero2;
        System.out.println("A multiplicação dos dois números é: " + resultado);

        resultado = numero1 / numero2;
        System.out.println("A divisão entre os dois números é: " + resultado);

    }
}

