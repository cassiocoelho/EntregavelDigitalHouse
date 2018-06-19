package exercicioInterface;

public class Carro implements Seguravel {
    private double valorDeMercado;
    private int anoFabricacao;

    public Carro(double valorDeMercado, int anoFabricacao){
        this.valorDeMercado = valorDeMercado;
        this.anoFabricacao = anoFabricacao;
    }

    public double calcularValorApolice() {
        double valorApolice = this.valorDeMercado * 0.40;
        if (this.anoFabricacao > 2000){
            valorApolice = this.valorDeMercado * 0.50;
        }
        return valorApolice;
    }

    public String obterDescricao() {
        return "Carro Ano: " + this.anoFabricacao + " e o valor dele é:" + this.valorDeMercado;
    }
}
