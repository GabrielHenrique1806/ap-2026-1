package AlgoritmoLista;//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo.

import java.util.Scanner;

public class AlgoritmoLista05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Váriaveis

        double custoF, custoD, custoI, custoC;

        // Recebimento de dados

        System.out.print("Insira o custo de fábrica do carro: R$ ");
        custoF = leia.nextDouble();

        // Processamento

        custoI = (custoF * 0.45) + custoF;
        custoD = (custoI * 0.28);
        custoC = (custoF + custoD);

        // Exibição

        System.out.println("O custo de fábrica do carro é R$ " + custoF + " considerando impostos com 45%  e percentual do distribuidor de 28% o custo ao consumidor é de R$ " + custoC);

    }

}
