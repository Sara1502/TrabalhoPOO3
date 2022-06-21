package Trabalhos_poo.TrabalhoPOO3;

public class Pessoas {
    private int id;
    private String nome;
    
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Id: " + id + ", Nome = " + nome;
    }

    
}
