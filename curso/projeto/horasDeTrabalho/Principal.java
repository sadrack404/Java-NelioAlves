package curso.projeto.horasDeTrabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Qual o seu Departamento: ");
        String departamento = in.next();

        System.out.println("Dados do empregado: ");
        System.out.print("Nome: ");
        String nome = in.next();
        System.out.print("Nivel: ");
        String nivel = in.next();
        System.out.print("Base Salarial: ");
        Double baseSalarial = in.nextDouble();

        Worker trabalhador = new Worker(nome, WorkerLevel.valueOf(nivel), baseSalarial, new Department(departamento));

        System.out.print("Quantos contratos para esse trabalhador? ");
        int numContratos = in.nextInt();

        for (int i = 0; i < numContratos; i++) {
            System.out.println("Quais os dados do #" + i +" contrato");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataDoContrato = sdf.parse(in.next());

            System.out.print("Valor por horas: ");
            Double valorPorHora = in.nextDouble() ;

            System.out.print("Duração das horas: ");
            int horas = in.nextInt() ;
            HourContract contract =  new HourContract(dataDoContrato, valorPorHora, horas );
        }
        System.out.println();
        System.out.println("Entre com o mes e ano para calcular o salario: ");
        String monthAndYear = in.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + trabalhador.getName());
        System.out.println("Departament: " +
                trabalhador.getDepartment().getName());
        System.out.println("Salario de: "
                + monthAndYear + " : "
                + String.format("%.2f", trabalhador.income(year, month)));
        in.close();
    }
}
