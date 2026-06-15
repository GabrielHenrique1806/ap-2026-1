
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            System.out.println("\n==============================");
            System.out.println("   BIBLIOTECA DE JOGOS");
            System.out.println("==============================");
            System.out.println("1. Cadastrar jogo");
            System.out.println("2. Editar jogo");
            System.out.println("3. Excluir jogo");
            System.out.println("4. Listar jogos");
            System.out.println("5. Sair");
            System.out.println("==============================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CADASTRAR JOGO ---");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Plataforma: ");
                    String plataforma = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    biblioteca.cadastrar(nome, plataforma, genero);
                    break;

                case 2:
                    System.out.println("\n--- EDITAR JOGO ---");
                    biblioteca.listar();
                    if (biblioteca.tamanho() == 0) break;
                    System.out.print("\nDigite o número do jogo que deseja editar: ");
                    int indiceEditar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Nova plataforma: ");
                    String novaPlataforma = scanner.nextLine();
                    System.out.print("Novo gênero: ");
                    String novoGenero = scanner.nextLine();
                    biblioteca.editar(indiceEditar, novoNome, novaPlataforma, novoGenero);
                    break;

                case 3:
                    System.out.println("\n--- EXCLUIR JOGO ---");
                    biblioteca.listar();
                    if (biblioteca.tamanho() == 0) break;
                    System.out.print("\nDigite o número do jogo que deseja excluir: ");
                    int indiceExcluir = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.excluir(indiceExcluir);
                    break;

                case 4:
                    biblioteca.listar();
                    break;

                case 5:
                    System.out.println("\nSaindo... Até mais!");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}