package curso.heranca.exFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de empresas: ");
        int n = sc.nextInt();

        List<Contribuntes> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + 1);
            System.out.print("Pessoa Fisica ou Juridica (F / J)?");
            String resp = sc.next();
            System.out.print("Name:");
            String nome = sc.next();
            System.out.print("Renda anual:");
            double rendaAnual = sc.nextDouble();

            if (resp.equalsIgnoreCase("F")) {
                System.out.print("Gastos médicos: ");
                double gastosMedicos = sc.nextDouble();
                PessoaFisica pf = new PessoaFisica(nome, rendaAnual, gastosMedicos);
                if (rendaAnual < 20000.00) {
                    pf.impostoPago(0.15);
                } else {
                    pf.impostoPago(0.25);
                }
                lista.add(pf);

            } else if (resp.equalsIgnoreCase("J")) {
                System.out.print("Numero de empregados: ");
                double empregados = sc.nextDouble();
                PessoaJuridica pj = new PessoaJuridica(nome, rendaAnual, empregados);
                pj.impostoPago(empregados);
                lista.add(pj);
            }
        }
        System.out.println("\n");
        System.out.println("TAXES PAID: ");
        for (Contribuntes c : lista) {
            System.out.println(c);
        }

        double sum = 0.0;
        for (Contribuntes l : lista) {
            sum += l.getRendaAnual();
        }
        System.out.println("\nTotal taxes: $" + sum);

    }
}
