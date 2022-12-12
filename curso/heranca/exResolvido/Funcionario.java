package curso.heranca.exResolvido;

public class Funcionario {
    private String nome;
    private Integer hora;
    private Double valorPorHoras;

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Double getValorPorHoras() {
        return valorPorHoras;
    }

    public void setValorPorHoras(Double valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }

    public Funcionario(String nome, Integer hora, Double valorPorHoras) {
        this.nome = nome;
        this.hora = hora;
        this.valorPorHoras = valorPorHoras;
    }

    public Double pagamento () {
        return valorPorHoras * hora;
    }

    @Override
    public String toString() {
        return nome + " - $ " + pagamento () ;
    }

}