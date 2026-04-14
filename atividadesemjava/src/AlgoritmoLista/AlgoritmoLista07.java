//Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno de 0 a 10 durante o semestre. Calcular a soma das notas e sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (média entre 5.1 a 6.9).

package AlgoritmoLista;

import java.util.Scanner;

public class AlgoritmoLista07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        String nome;
        float notaUm, notaDois, notaTres, media;

        // Recebimento de dados

        System.out.print("Insira o nome do aluno: ");
        nome = leia.nextLine();

        System.out.print("Insira a primeira nota: ");
        notaUm = leia.nextFloat();

        System.out.print("Insira a segunda nota: ");
        notaDois = leia.nextFloat();

        System.out.print("Insira a terceira nota: ");
        notaTres = leia.nextFloat();

        // Processamento

        media = (notaUm + notaDois + notaTres)/3;

        // Aprovado / Reprovado

        if (media >= 7){
            System.out.println("O aluno "+nome+" foi aprovado e sua média é: " + media);
        } else if (media <= 5) {
            System.out.println("O aluno "+nome+" foi reprovado e sua média é: " + media);
        }
        else {
            System.out.println("O aluno "+nome+" está em recuperação e sua média é: " + media);
        }
    }
}
