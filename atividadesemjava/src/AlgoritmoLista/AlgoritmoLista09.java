//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2010 - 12% e acima de 2010 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta digite: “(N) Não” . Informar total de carros com ano até 2010 e total geral.

package AlgoritmoLista;

import java.util.Scanner;

public class AlgoritmoLista09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        int anoCarro, carrosAte2010, totalCarros;
        double valorCarro, desconto, valorFinal;
        String resposta;

        // Zerando valores

        resposta = "Sim";
        carrosAte2010 = 0;
        totalCarros = 0;

        // Repetição enquanto

        while (resposta.equals("Sim")){

        System.out.print("Insira o ano do carro (yyyy): ");
        anoCarro = leia.nextInt();

        System.out.print("Insira o valor do carro: R$ ");
        valorCarro = leia.nextDouble();

        if (anoCarro <=2010) {
            desconto = (valorCarro * 0.12);
            carrosAte2010 = carrosAte2010 + 1;
        }
        else {
            desconto = (valorCarro * 0.07);
        }

        // Fim do IF

        valorFinal = valorCarro - desconto;

        System.out.println("O valor de desconto é: R$ "+ desconto);
        System.out.println("O valor final do veículo com os descontos é: R$ "+ valorFinal);

        totalCarros = totalCarros + 1;

        // Validador

        leia.nextLine();
        System.out.println("Deseja continuar? Sim ou Não.");
        resposta = leia.nextLine();

        }

        // Mensagem final após validador = Não

        System.out.println("Total de carros: " + totalCarros);
        System.out.println("Carros até 2010: " + carrosAte2010);

    }
}
