package Exercicio;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class HashSetTeste {

    public static void main(String[] args) {
        Set<String> cadastro = new HashSet<String>();
        Set<Double> limiteAprovado = new HashSet<Double>();
        Set<Integer> qtdeMeses = new HashSet<Integer>();

        cadastro.add("Nome");
        cadastro.add("Sobrenome");
        cadastro.add("Endereço");
        cadastro.add("Data Nascimento");
        cadastro.add("Nacionalidade");
        cadastro.add("Naturalidade");
        limiteAprovado.add(50.0 * 10);
        qtdeMeses.add(36 / 3);

       System.out.println(cadastro);
       System.out.println(limiteAprovado);
       System.out.println(qtdeMeses);
    }
}