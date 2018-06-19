package Exercicio;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        List<String> minhaLista = new ArrayList<String>();
        minhaLista.add("silvio");
        minhaLista.add("roque");
        minhaLista.add("pavorô");
        minhaLista.add("teste");

        System.out.println(minhaLista);


        minhaLista.remove(1);
        minhaLista.remove("silvio");
        System.out.println(minhaLista);


        List<Integer> minhaListaInt = new ArrayList<>();
        minhaListaInt.add(1 * 100 / 2);
        minhaListaInt.add(2);
        minhaListaInt.add(3);
        minhaListaInt.add(4);

        System.out.println(minhaListaInt);
    }

    public static void imprimirString(List<String> listaParaImprimir) {

        for (String algoDaMinhaLista : listaParaImprimir) {
            System.out.println(algoDaMinhaLista);
        }


    }

}

