package exercicios.vetores;

import curso.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double mediaAltura = 0;
        double menorDeIdade = 0;

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        Pessoa[] p = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados da "+ i + "a pessoa:") ;
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            p[i] = new Pessoa(nome, idade, altura);

            mediaAltura = (mediaAltura + p[i].getAltura()/n);
            if (p[i].getIdade() < 16){
                menorDeIdade++;
            }
        }

        System.out.println("Altura média: :" + mediaAltura);
        System.out.println("Pessoas com menos de 16 anos: " + (menorDeIdade * 100)/ n + "%");

        for (int i = 0; i < n; i++) {
            if (p[i].getIdade() < 16){
                System.out.println(p[i].getNome());
            }
        }
    }
}