package ExercicioEntregavel;

public class ProfAdjunto extends Professor {

    private int qtdeHoras;

    public ProfAdjunto( String nome, String sobbrenome, int tempoDeCasa, int codigoProfessor, int qtdeHoras ) {
        super(nome, sobbrenome, tempoDeCasa, codigoProfessor);
        this.qtdeHoras = qtdeHoras;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras( int qtdeHoras ) {
        this.qtdeHoras = qtdeHoras;
    }
}
