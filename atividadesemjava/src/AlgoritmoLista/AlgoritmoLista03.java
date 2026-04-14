package AlgoritmoLista;// Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

public class AlgoritmoLista03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Variáveis

        float valorReal, cotacao, qntdDolar;

        // Recebimento de dados

        System.out.print("Qual o valor da cotação do dólar: R$ ");
        cotacao = leia.nextFloat();

        System.out.print("Qual a quantidade de dólares disponivéis com você atualmente: US$ ");
        qntdDolar = leia.nextFloat();

        // Processamento

        valorReal = cotacao * qntdDolar;

        // Exibição

        System.out.println("A cotação do dólar é R$ " + cotacao + " atualmente você tem disponível US$ " + qntdDolar + " resultando numa conversão de R$ " + valorReal);

    }
}
