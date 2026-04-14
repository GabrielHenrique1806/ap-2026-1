//Faça uma função que recebe, por parâmetro um valor N, um valor O e um valor T e calcule e escreve a taboada de 1 até T. Mostre a taboada na forma: Onde “N” é o valor de calculo da taboada “O” é o operador da tabuada e “T” é o ultimo numero que será realizado a conta da tabuada. Exemplo, n = 5, O = “S” e T = 10, irá fazer a tabuada de soma do numero 5 até chegar no numero 10.

package AlgoritmoLista;

import java.util.Scanner;

public class AlgoritmoLista10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        int numeral, termino;
        double resultado, aux;
        String operador;

        // Recebimento de dados

        System.out.print("Quer ver a tabuada de qual número? ");
        numeral = leia.nextInt();

        System.out.print("Qual numero quer que a tabuada pare? ");
        termino = leia.nextInt();

        leia.nextLine();
        System.out.print("Insira qual tabuada deseja calcular - (+) Soma, (-) Subtração, (*) Multiplicação, (/) Divisão. ");
        operador = leia.nextLine();

        // Início da função repita

        for (aux = 1; aux <= termino; aux++){

            if (operador.equals("+")){
                resultado = numeral + aux;
            }
            else if (operador.equals("-")) {
                resultado = numeral - aux;
            }
            else if (operador.equals("*")) {
                resultado = numeral * aux;
            }
            else {
                resultado = numeral / aux;
            }
            
            System.out.println(numeral + " " + operador + " " + aux + " = " + resultado);

        }
    }
}
