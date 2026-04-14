package AlgoritmoLista;//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês. ● Considere fixo o juro da poupança em 0,70% a. m.

import java.util.Scanner;

public class AlgoritmoLista04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        double valorDepositado, valorRendimento;

        // Recebendo dados

        System.out.print("Insira o valor que foi depositado na poupança: R$ ");
        valorDepositado = leia.nextDouble();

        // Processamento

        valorRendimento = (0.007*valorDepositado)+valorDepositado;

        // Exibição

        System.out.println("O valor depositado na poupança foi R$ "+valorDepositado+" com juros fixos de 0,70%, rendeu ao final do mês R$ "+ valorRendimento);

    }

}
