package curso.heranca.exResolvido;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o numero de empregados?");
        int n_Empregados = sc.nextInt();

        List<Funcionario> listaDeFuncionarios = new ArrayList<>();

        for (int i = 1; i <= n_Empregados ; i++) {
            System.out.println("Empregado #" + i + " data:");
            System.out.print("Terceirizado (y/n)? ");
            String x = sc.next();

            if (Objects.equals(x, "n")) {
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Hora: ");
                int hora = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorPorHoras = sc.nextDouble();

                Funcionario funcionario =  new Funcionario(nome, hora, valorPorHoras);
                listaDeFuncionarios.add(funcionario);

            } else if (Objects.equals(x, "y")) {
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Hora: ");
                int hora = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorPorHoras = sc.nextDouble();
                System.out.print("Carga adicional: ");
                double adicional = sc.nextDouble();

                Funcionario funcionario =  new TerceirizadoFuncionario(nome, hora, valorPorHoras, adicional);
                listaDeFuncionarios.add(funcionario);
            } else {
                System.out.println("Digite uma opção válida");
            }
        }
        System.out.println("Pagamento");
        for (Funcionario f: listaDeFuncionarios ) {
            System.out.println(f);
        }
    }
}
