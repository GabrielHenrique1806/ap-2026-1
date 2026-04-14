package AlgoritmoLista;//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class AlgoritmoLista02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //Variáveis

        float temperaturaF, temperaturaC;

        //Recebimento de dados

        System.out.print("Insira a temperatura em Graus Celsius (ºC): ");
        temperaturaC = leia.nextFloat();

        //Processamento

        temperaturaF = (9*temperaturaC+160)/5;

        //Exibição

        System.out.println("A temperatura apresentada em Celsius é de: " + temperaturaC + "ºC " + " convertida em Fahrenheit é: " + temperaturaF + "ºF");

    }
}
