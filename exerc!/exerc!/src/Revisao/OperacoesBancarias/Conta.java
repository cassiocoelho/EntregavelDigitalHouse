package Revisao.OperacoesBancarias;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente titular;

public Conta(int numeroConta, Cliente titular) {
    this.numeroConta = numeroConta;
    this.saldo = 0.00;
    this.titular = titular;

    }

public double deposito( double qtdeEmDinheiro ) {
    this.saldo = qtdeEmDinheiro + saldo;
    System.out.println("Deposito realizado " + saldo );
    return saldo;
    }

public void saque(double qtdeEmDinheiro, Cliente cliente) {

  if (qtdeEmDinheiro > saldo) {
     System.out.println("Saque não autorizado");
      System.out.println("Numero Conta: " + this.numeroConta);
      System.out.println("Nome: " + cliente.getNome());
  }
  else {
      saldo = saldo - qtdeEmDinheiro;
      System.out.println("Saque autorizado, saldo atual: " + saldo);
      System.out.println("Numero Conta: " + this.numeroConta);
      System.out.println("Nome: " + cliente.getNome());
  }
  }
}
