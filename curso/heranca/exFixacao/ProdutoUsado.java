package curso.heranca.exFixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    private final SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");

    private Date manufatura;

    public ProdutoUsado() {
    }

    public ProdutoUsado(Date manufatura) {
        this.manufatura = manufatura;
    }

    public ProdutoUsado(String nome, Double preco, Date manufatura) {
        super(nome, preco);
        this.manufatura = manufatura;
    }

    public Date getManufatura() {
        return manufatura;
    }

    public void setManufatura(Date manufatura) {
        this.manufatura = manufatura;
    }

    @Override
    public String priceTag() {
        StringBuilder stb = new StringBuilder();
        stb.append(getNome())
                .append(" (used) ")
                .append(" $ ")
                .append(getPreco())
                .append("( Manufacture date: ")
                .append(sdf.format(String.valueOf(getManufatura())))
                .append(")");
        return stb.toString();
    }

}