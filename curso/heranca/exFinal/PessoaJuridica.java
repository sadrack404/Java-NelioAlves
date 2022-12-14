package curso.heranca.exFinal;

public class PessoaJuridica extends Contribuntes{
    private Double numeroDeFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Double numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public void impostoPago(Double funcionarios){

        double novaRenda;
        if (funcionarios > 10){
            novaRenda = getRendaAnual() * 0.14;
            setRendaAnual(novaRenda);
            return;
        }
        novaRenda = getRendaAnual() * 0.16;
        setRendaAnual(novaRenda);
    }

    public Double getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Double numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

}