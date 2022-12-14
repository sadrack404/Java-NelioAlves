package curso.exercicios.vetores;

import curso.desafio.Hospede;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        Hospede[] rooms =  new Hospede[10];

        for (int i = 0; i < n ; i++) {
            sc.nextLine();
            System.out.println("RENT#"+i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("e-mail: ");
            String email = sc.nextLine();
            System.out.print("room: ");
            int room = sc.nextInt();
            Hospede student = new Hospede(name, email);
            rooms[room] = student;
        }

        System.out.println("Busy rooms: ");
        /*
        A primeira váriavel é um exemplo do tipo a ser percorrido
        A segunda váriavel é a lista a ser percorrida.

        for (Hospede x: rooms) {
            if (x != null){
                System.out.println(rooms[x], x);
            }
        }
*/
        for (int i = 0; i < n; i++) {
            if (rooms[i] != null){
                System.out.println(rooms[i]);
            }
        }
        sc.close();
    }
}