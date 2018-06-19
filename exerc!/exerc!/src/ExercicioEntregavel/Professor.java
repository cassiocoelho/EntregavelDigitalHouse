package ExercicioEntregavel;

public class Professor {
    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigoProfessor;

    public Professor( String nome, String sobbrenome, int tempoDeCasa, int codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getSobbrenome() {
        return sobrenome;
    }

    public void setSobbrenome( String sobbrenome ) {
        this.sobrenome = sobbrenome;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor( int codigoProfessor ) {
        this.codigoProfessor = codigoProfessor;
    }

    public int getTempoDeCasa() { return tempoDeCasa;    }

    public void setTempoDeCasa( int tempoDeCasa ) {
        this.tempoDeCasa = tempoDeCasa;
    }
}
