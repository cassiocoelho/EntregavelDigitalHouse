package Revisao.OperacoesBancarias;

public class Cliente {
    private String nome;
    private String sobrenome;

    public Cliente(){}

    public Cliente (String nome1, String sobrenome2){
        this.nome = nome1;
        this.sobrenome = sobrenome2;
    }

    public void setNome (String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome () { return nome + " " + sobrenome; }
}
