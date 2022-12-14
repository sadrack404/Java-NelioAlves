package curso.heranca.exFinal;

import java.util.List;

public abstract class Contribuntes {
    private String nome;
    private Double rendaAnual;

    public Contribuntes() {
    }

    public Contribuntes(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public abstract void impostoPago(Double porcentagem) ;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString() {

        return nome +
                ": $ " +
                rendaAnual;
    }
}
