package curso.exercicios.dataEhora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class dataTeste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Imprime a data
        LocalDate data = LocalDate.now();
        //Imprime a data e a hora
        LocalDateTime data1 = LocalDateTime.now();
        //Imprime o instante atual
        Instant i = Instant.now();

        //Instancia uma data
        LocalDate data2 = LocalDate.parse("2022-11-20");

        LocalDateTime data3 = LocalDateTime.parse("2022-11-20T01:30:26");
        System.out.println(data);

    }
}
