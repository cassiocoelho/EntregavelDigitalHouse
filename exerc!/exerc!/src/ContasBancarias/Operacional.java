package ContasBancarias;

import java.util.Objects;

public class Operacional {

    public static void main (String [] args){

        Cliente cassio = new Cliente();

        Conta contaCorrente = new Conta(69632, cassio);

        System.out.println(contaCorrente.emprestimo(50000.00, 3,36));


    }
}