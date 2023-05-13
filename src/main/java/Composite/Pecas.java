package Composite;

public abstract class Pecas {

    private String nome;

    public Pecas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getPeca();
}
