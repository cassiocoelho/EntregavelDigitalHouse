package ExercicioEntregavel;

import java.util.Calendar;

public class Matricula {
   private Aluno aluno;
   private Curso curso;
   private Calendar dataMatricula;

   public Matricula( Aluno aluno, Curso curso, Calendar dataMatricula ) {
     this.aluno = aluno;
     this.curso = curso;
     this.dataMatricula = Calendar.getInstance();
    }
}
