package cachorroExercicio;

public class Passeio {

    public static void main(String[] args) {

        Pessoa cassinho = new Pessoa();
        cassinho.nome = "Cassio";

        cassinho.cachorro = new Cachorro();

        cassinho.cachorro.nome = "Tob";
        cassinho.cachorro.idade = 3;
        cassinho.cachorro.raca = "Golden";
        cassinho.cachorro.sexo = "M";
        cassinho.cachorro.gritar();
        

        Caminhar ibira = new Caminhar ();
        ibira.andar (cassinho);
    }
}