package curso.heranca.exFinal;

public class PessoaFisica extends Contribuntes{
private final Double gastoComSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public void impostoPago(Double porcentagem){
        double novaRenda = getRendaAnual() * porcentagem - gastoComSaude * 0.50;
        setRendaAnual(novaRenda);
    }


}
