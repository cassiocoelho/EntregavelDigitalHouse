package exercicioInterface;

public class Imovel implements Seguravel {
    private double valorDeMercado;
    private int areaConstruida;

    public Imovel(double valorDeMercado, int areaConstruida){
        this.valorDeMercado = valorDeMercado;
        this.areaConstruida = areaConstruida;
    }

    public double calcularValorApolice() {
        return valorDeMercado * 0.30;
    }
    public String obterDescricao() {
        return "Imovel com area construida de: " + this.areaConstruida + " e valor de mercado : " + this.valorDeMercado;
    }

}
