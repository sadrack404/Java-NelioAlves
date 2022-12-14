package curso.heranca.exFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o número de produtos: ");
        int n_Produtos = sc.nextInt();

        List<Produto> lista = new ArrayList<>();

        for (int i = 1; i <= n_Produtos; i++) {
            System.out.println("Dados do roduto #" + i);
            System.out.print("O produto é importado, usado ou commum? (c/u/i)?");
            String alternativa = sc.next();
            if (Objects.equals(alternativa, "i")) {
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preco: ");
                Double preco = sc.nextDouble();
                System.out.print("Customs Fee: ");
                Double customsFee = sc.nextDouble();
                ProdutoImportado pi = new ProdutoImportado(nome, preco, customsFee);
                lista.add(pi);
            } else if (Objects.equals(alternativa, "c")) {
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Preco: ");
                Double preco = sc.nextDouble();
                Produto produto = new Produto(nome, preco);
                lista.add(produto);
            } else if (Objects.equals(alternativa, "u")) {
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Preco: ");
                Double preco = sc.nextDouble();
                System.out.print("Customs Fee: ");
                Date dataProducao = sdf.parse(sc.next());
                ProdutoUsado produtoUsado = new ProdutoUsado(nome, preco, dataProducao);
                lista.add(produtoUsado);
            } else {
                System.out.println("Valor inválido");
            }
        }
        System.out.println("Price Tags");
        for (Produto p : lista) {
            System.out.println(p.priceTag());
        }

    }
}
