package curso.heranca.exResolvido;

public class TerceirizadoFuncionario extends Funcionario {

    private Double valorAdicional;
    public TerceirizadoFuncionario() {
        super();
    }

    public TerceirizadoFuncionario(String nome, Integer hora, Double valorPorHoras, Double valorAdicional) {
        super(nome, hora, valorPorHoras);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public Double pagamento () {
        return super.pagamento() + valorAdicional + 1.1;
    }

    @Override
    public String toString() {
        return getNome() + " - $ " + pagamento () ;
    }

}
