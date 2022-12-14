package curso.heranca.exFixacao;

import java.text.SimpleDateFormat;

public class ProdutoImportado extends Produto {

    private Double customFee;

    public ProdutoImportado(String nome, Double preco, Double customFee) {
        super(nome, preco);
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        StringBuilder stb = new StringBuilder();
        stb.append(getNome())
                .append(" $ ")
                .append(getPreco())
                .append("( customs fee: $")
                .append(customFee)
                .append(")");

        return stb.toString();
    }

    public Double totalPrice() {
        return 10.0;
    }

}