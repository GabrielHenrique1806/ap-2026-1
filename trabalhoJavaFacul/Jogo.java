public class Jogo {
    private String Nome;
    private String Genero;
    private String Plataforma;

    public Jogo(String nome, String genero, String plataforma) {
        this.Nome = nome;
        this.Genero = genero;
        this.Plataforma = plataforma;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String plataforma) {
        Plataforma = plataforma;
    }


    @Override    public String toString() {
        return "Nome: " + Nome + ", Gênero: " + Genero + ", Plataforma: " + Plataforma;
    }
}
