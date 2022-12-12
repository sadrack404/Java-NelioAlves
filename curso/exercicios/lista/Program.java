package curso.exercicios.lista;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //Criei uma lista, um list é uma interface, por isso temos que usar um arraylist
        List<String> lista = new ArrayList<>();
        //Adicionar um elemento
        lista.add("Caio");
        lista.add("Marcos");
        lista.add("Gabriel");
        lista.add("Maria");

        lista.add(1,"Rosa");
        System.out.println("-------------------------");
        System.out.println("Tamanho da lista: " + lista.size());
        for (String pessoa: lista) {
            System.out.println(pessoa);
        }

        System.out.println("-------------------------");
        //Esse método remove pelo index
        lista.remove(1);
        System.out.println("Tamanho da lista: " + lista.size());
        for (String p: lista ) {
            System.out.println(p);
        }
        //Pegue esse valor X (tal que) -> o caractere 0 de X seja igual a M
        lista.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("-------------------------");
        System.out.println("Index of Gabriel: " + lista.indexOf("Gabriel"));
        System.out.println("Index of bob: " + lista.indexOf("Bob"));

        System.out.println("-------------------------");
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'G').toList();
        for (String x : result){
            System.out.println(x);
        }
    }
}
