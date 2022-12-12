package curso.exercicios.lista;

import curso.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quantos empregados gostaria de registrar: ");
        int nEmpregados = in.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i <= nEmpregados; i++) {
            in.nextLine();
            System.out.println("Employee #" + (i++) +":");
            System.out.print("Id: ");
            int id = in.nextInt();
            System.out.print("Name: ");
            String nome = in.next();
            System.out.print("Salary: ");
            double salario = in.nextDouble();

            Employee empregado =  new Employee(id, nome, salario);
            list.add(empregado);
        }

        System.out.print("Qual o id do empregado que quer dar um aumento de salário: ");
        int idSalario = in.nextInt();
        //int pos = position(list, idSalario);
        Employee emp = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);


        if (emp == null){
            System.out.println("Esse id não existe");
        } else {
            System.out.print("Qual a porcentagem do aumento: ");
            int percent = in.nextInt();
            emp.aumentoSalario(percent);

        }

        System.out.println();
        System.out.print("Lista de empregados: ");
        for (Employee x: list ) {
            System.out.println(x);
        }
        in.close();
    }

    /*
    public static int position(List<Employee> e, int id){
        for (int i = 0; i < e.size(); i++) {
            if(e.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    };
    */
}
