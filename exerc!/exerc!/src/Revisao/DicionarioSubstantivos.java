package Revisao;

import java.util.HashMap;
import java.util.Map;

public class DicionarioSubstantivos {
    public static void main(String[] args) {

        Map<Integer, String> dicionario = new HashMap<>();

        dicionario.put(00, "Ovos");
        dicionario.put(01, "Água");
        dicionario.put(02, "Escopeta");
        dicionario.put(03, "Cavalo");
        dicionario.put(04, "Dentista");
        dicionario.put(05, "Fogo");


    for (int key: dicionario.keySet()){

        String value = dicionario.get(key);

        System.out.println(key + " = " + value);
    }
    }
}
