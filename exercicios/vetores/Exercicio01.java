package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        // e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");

        int arraySize = input.nextInt();

        int[] lista = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            input.nextLine();
            System.out.println("Digite um numero");
            lista[i] = input.nextInt();

        }

        for (int i = 0; i < arraySize; i++) {
            if (lista[i] < 0) {
                System.out.println("Numeros negativos \n"
                        + lista[i]);
            }
        }

    }
}
