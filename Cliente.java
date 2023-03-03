package Mentorama.DesafioMod9;

public class Cliente {
    private String nome;
    private int quantidadeCompras;

    public Cliente(String nome, int quantidadeCompras) {
        this.nome = nome;
        this.quantidadeCompras = quantidadeCompras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeCompras() {
        return quantidadeCompras;
    }

    public void setQuantidadeCompras(int quantidadeCompras) {
        this.quantidadeCompras = quantidadeCompras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", quantidadeCompras=" + quantidadeCompras +
                '}';
    }
}
