package Revisao.OperacoesBancarias;

public class Operacao {
    public static void main (String [] args){

   Cliente cliente1 = new Cliente();
   Cliente cliente2 = new Cliente();

   cliente1.setNome("Cassio","Souza");
   cliente2.setNome("Romario", "Ferreira");

   Conta contaCorrente = new Conta(69632, cliente1);
   Conta contaCorrente2 = new Conta(2424, cliente2);

    System.out.println(contaCorrente.deposito(5000.00));
    System.out.println(contaCorrente2.deposito(1000));
    contaCorrente.saque(50.00, cliente1);
        System.out.println(" ");
    contaCorrente2.saque(2000,cliente2);
    }
}
