package exercicioInterface;

public class CorretoraSeguros {
    public CorretoraSeguros(){
    }
    public void fazerPropostaSeguro(Seguravel objetoSeguravel){
        System.out.println("________-__________");
        System.out.println("Proposta - Corretora");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("Valor da apolice:");
        System.out.println(objetoSeguravel.calcularValorApolice());
        System.out.println("____________-__________\n");
    }
}
