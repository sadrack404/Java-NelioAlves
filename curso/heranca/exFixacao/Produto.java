package curso.heranca.exFixacao;

public class Produto {
    private String nome;
    private Double preco;

    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String priceTag() {
        StringBuilder stb = new StringBuilder();
        stb.append(nome)
                .append(" $ ")
                .append(preco);
        return stb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
