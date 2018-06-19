package Exercicio;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDicionario {

    public static void main(String[] args) {

    Map<Integer, String> dicionario = new HashMap<>();

    dicionario.put(01, "Insano");
    dicionario.put(02, "Aceitação");
    dicionario.put(03, "Alunos");
    dicionario.put(04, "Altruísmo");

    int key = 3;
        key = 2;


        System.out.println(dicionario.get(key));

}
}
