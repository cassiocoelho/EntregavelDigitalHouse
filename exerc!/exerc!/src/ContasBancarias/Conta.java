package ContasBancarias;

public class Conta {

    private int numeroConta;
    private double saldo;
    private Cliente titular;
    public double emprestimo;

    public Conta() {
    }

    public Conta(int numeroConta, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = 0.00;
        this.titular = titular;

    }

    public void deposito(double qtdeEmDinheiro) {
        this.saldo = qtdeEmDinheiro + saldo;
        System.out.println("Deposito realizado " + saldo);
    }

    public void saque(double qtdeEmDinheiro) {

        if (qtdeEmDinheiro > saldo) {
            System.out.println("Saque não autorizado");
        } else {
            saldo = saldo - qtdeEmDinheiro;
            System.out.println("Saque autorizado, saldo atual: " + saldo);
        }
    }

        public double emprestimo (double valorEmprestimo,int percentual,int meses ) {

            double valorJurosMensal = (valorEmprestimo * percentual)/100;
            double valorJurosTotal = (valorJurosMensal * meses);
            double valorParcela = (valorEmprestimo + valorJurosTotal) / meses;
            return valorParcela;
        }

    }