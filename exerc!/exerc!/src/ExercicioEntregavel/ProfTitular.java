package ExercicioEntregavel;

public class ProfTitular extends Professor {

    private String especialidade;

    public ProfTitular( String nome, String sobbrenome, int tempoDeCasa, int codigoProfessor, String especialidade) {
        super(nome, sobbrenome, tempoDeCasa, codigoProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade( String especialidade ) {
        this.especialidade = especialidade;
    }
}
