package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    /*
    Faça um programa que leia N números reais
    e armazene-os em um vetor. Em seguida:

    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do veto
     */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar?");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero :");
            array[i]= sc.nextInt();
        }

        double soma = 0.0;
        double avg = 0.0;

        for (int i = 0; i < n; i++) {
            soma = soma + array[i];
        }

        avg = soma / n;
        System.out.println("Soma = " + soma);
        System.out.println("Media = " + avg);

    }
}
