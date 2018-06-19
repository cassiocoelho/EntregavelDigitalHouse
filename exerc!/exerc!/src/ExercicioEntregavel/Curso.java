package ExercicioEntregavel;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String curso;
    private int codigoCurso;
    private Professor profTitular;
    private Professor profAdjunto;
    private int qtdeMaxima;
    private List<Aluno> listaMatriculados;

    public Curso( String curso, int codigoCurso, int qtdeMaxima ) {
        this.curso = curso;
        this.codigoCurso = codigoCurso;
        this.qtdeMaxima = qtdeMaxima;
        this.listaMatriculados = new ArrayList <>();
    }

    public Boolean adicionarUmAluno( Aluno umAluno ) {

        if (listaMatriculados.size() <= qtdeMaxima) {
            listaMatriculados.add(umAluno);
            System.out.println("Matricula realizada");
            return true;
        } else {
            System.out.println("Não há vagas");
            return false;

        }
    }

    public void excluirAluno( Aluno umAluno ) {
        listaMatriculados.remove(umAluno);
    }

    public String getMobile() {
        return curso;
    }

    public void setMobile( String mobile ) {
        this.curso = curso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso( int codigoCurso ) {
        this.codigoCurso = codigoCurso;
    }

    public Professor getProfTitular() {
        return profTitular;
    }

    public void setProfTitular( Professor profTitular ) {
        this.profTitular = profTitular;
    }

    public Professor getProfAdjunto() {
        return profAdjunto;
    }

    public void setProfAdjunto( Professor profAdjunto ) {
        this.profAdjunto = profAdjunto;
    }

    public int getQtdeMaxima() {
        return qtdeMaxima;
    }

    public void setQtdeMaxima( int qtdeMaxima ) {
        this.qtdeMaxima = qtdeMaxima;
    }
}
