import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Jogo> jogos;

    public Biblioteca() {
        jogos = new ArrayList<>();
    }

    // Cadastrar novo jogo
    public void cadastrar(String nome, String plataforma, String genero) {
        Jogo novoJogo = new Jogo(nome, plataforma, genero);
        jogos.add(novoJogo);
        System.out.println("\nJogo cadastrado com sucesso!");
    }

    // Listar todos os jogos
    public void listar() {
        if (jogos.isEmpty()) {
            System.out.println("\nNenhum jogo cadastrado.");
            return;
        }
        System.out.println("\n=== LISTA DE JOGOS ===");
        for (int i = 0; i < jogos.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + jogos.get(i));
        }
    }

    // Editar jogo pelo índice
    public void editar(int indice, String novoNome, String novaPlataforma, String novoGenero) {
        if (indice < 1 || indice > jogos.size()) {
            System.out.println("\nNúmero inválido.");
            return;
        }
        Jogo jogo = jogos.get(indice - 1);
        jogo.setNome(novoNome);
        jogo.setPlataforma(novaPlataforma);
        jogo.setGenero(novoGenero);
        System.out.println("\nJogo editado com sucesso!");
    }

    // Excluir jogo pelo índice
    public void excluir(int indice) {
        if (indice < 1 || indice > jogos.size()) {
            System.out.println("\nNúmero inválido.");
            return;
        }
        jogos.remove(indice - 1);
        System.out.println("\nJogo excluído com sucesso!");
    }

    // Retorna quantos jogos há na lista (útil pro menu)
    public int tamanho() {
        return jogos.size();
    }
}