package Revisao;

import java.util.HashMap;
import java.util.Map;

public class DicionarioNomesApelidos {
    public static void main(String[] args) {

        Map<String, String> dicionarioApelidos = new HashMap<>();

        dicionarioApelidos.put("João", "Juan, Fissura, Maromba");
        dicionarioApelidos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        dicionarioApelidos.put("Maria", "Wonder Woman, Mary, Marilene");
        dicionarioApelidos.put("Lucas", "Lukinha, Jorge, George");

        for (String key : dicionarioApelidos.keySet()){

            String value = dicionarioApelidos.get(key);

            System.out.println(key + " = " + value);
        }
    }
}
