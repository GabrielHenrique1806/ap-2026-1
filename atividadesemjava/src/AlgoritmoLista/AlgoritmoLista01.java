package AlgoritmoLista;//Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.

import java.util.Scanner;

public class AlgoritmoLista01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //Variáveis

        float combustivelGasto, distancia, consumoMedio;

        //Recebimento de dados

        System.out.print("Insira a distância total percorrida em km: ");
        distancia = leia.nextFloat();

        System.out.print("Insira o total de combustível gasto: ");
        combustivelGasto = leia.nextFloat();

        //Processamento

        consumoMedio = distancia / combustivelGasto;

        //Exibição

        System.out.println("A autonomia do automóvel é: " + consumoMedio + " Km/L");

    }
}
