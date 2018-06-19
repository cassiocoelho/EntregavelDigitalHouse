package exercicioInterface;

public class Principal {
    public static void main(String[] args) {
        CorretoraSeguros razaoSocial = new CorretoraSeguros();
        Carro marca_modelo = new Carro(20000.00, 2016 );
        Imovel tipo_tamanho = new Imovel(500000.00, 365);
        Moto modelo_marca = new Moto (20000, 2016);

        razaoSocial.fazerPropostaSeguro(marca_modelo);
        razaoSocial.fazerPropostaSeguro(tipo_tamanho);
        razaoSocial.fazerPropostaSeguro(modelo_marca);
    }
}
