package ExercicioEntregavel;

public class Aluno {
    private String nome;
    private String sobbrenome;
    private int codigoAluno;

    public Aluno( String nome, String sobbrenome, int codigoAluno ) {
        this.nome = nome;
        this.sobbrenome = sobbrenome;
        this.codigoAluno = codigoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getSobbrenome() {
        return sobbrenome;
    }

    public void setSobbrenome( String sobbrenome ) {
        this.sobbrenome = sobbrenome;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno( int codigoAluno ) {
        this.codigoAluno = codigoAluno;
    }
}
