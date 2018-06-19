package exercicioInterface;

public class Moto implements Seguravel {
    private double valorDoMercado;
    private int anoFabricacao;

    public Moto(double valorDoMercado, int anoFabricacao) {
        this.valorDoMercado = valorDoMercado;
        this.anoFabricacao = anoFabricacao;
    }
    public double calcularValorApolice() {
        double valorApolice = this.valorDoMercado * 0.40;
        if (this.anoFabricacao > 2000 || this.valorDoMercado > 200000.00) {
        valorApolice = this.valorDoMercado * 0.20;
      }
        return valorApolice;
      }
      public String obterDescricao () {
        return "Moto Ano: " + this.anoFabricacao + " e o valor dele é:" + this.valorDoMercado;
      }
    }

