package ExercicioEntregavel;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List <Aluno> listAlunos;
    private List <Professor> listProfessor;
    private List <Curso> listCurso;
    private List <Integer> listMatricula;


    public DigitalHouseManager() {
        this.listAlunos = new ArrayList <>();
        this.listProfessor = new ArrayList <>();
        this.listCurso = new ArrayList <>();
        this.listMatricula = new ArrayList <>();
    }

    public void registrarCurso( String curso, int codigoCurso, int qtdeMaxima ) {
        Curso novaTurma = new Curso(curso, codigoCurso, qtdeMaxima);
        this.listCurso.add(novaTurma);
    }

    public void excluirCurso( Integer codigoCurso ) {
        if (listCurso.isEmpty()) {
            System.out.println("Lista Vazia Porraaaaa!!!");
        } else {
            for (int i = 0; i < listCurso.size(); i++) {
                listCurso.remove(codigoCurso);
            }
        }
    }

    public void registrarProfessorAdjunto( String nome, String sobrenome, int tempoDeCasa, Integer codigoProfessor, Integer qtdeHoras ) {
        ProfAdjunto novoAdjunto = new ProfAdjunto(nome, sobrenome, tempoDeCasa, codigoProfessor, qtdeHoras);
        this.listProfessor.add(novoAdjunto);
    }

    public void registrarProfTitular( String nome, String sobrenome, int tempoDeCasa,Integer codigoProfessor, String especialidade ) {
        ProfTitular novoTitular = new ProfTitular(nome, sobrenome, tempoDeCasa,codigoProfessor, especialidade);
        this.listProfessor.add(novoTitular);
    }

    public void excluirProfessor( Integer codigoProfessor ) {
        if (listProfessor.isEmpty()) {
            System.out.println("Sem registro para exclusão porra...");
        } else {
            for (int i = 0; i < listProfessor.size(); i++)
                listProfessor.remove(codigoProfessor);
        }
    }

    public void registrarAluno( String nome, String sobrenome, Integer codigoAluno ) {
        Aluno novoAluno = new Aluno(nome, sobrenome, codigoAluno);
        this.listAlunos.add(novoAluno);
    }

    public void matricularAluno( Integer codigoAluno, Integer codigoCurso ) {
        for (int i = 0; i < listAlunos.size(); i++)
            if (listAlunos.get(i).getCodigoAluno() == codigoAluno) {
                for (int j = 0; j < listCurso.size(); j++) {
                    if (listCurso.get(j).getCodigoCurso() == codigoCurso) {
                        listCurso.get(j).adicionarUmAluno(listAlunos.get(i));
                    }
                }
            }
    }

    public void alocarProfessores( Integer codigoCurso, Integer codigoProfTitular, Integer codigoProfAdjunto ) {
        for (int i = 0; i < listCurso.size(); i++) {
            if (listCurso.get(i).getCodigoCurso() == codigoCurso) {
                for (int j = 0; j < listProfessor.size(); j++) {
                    if (listProfessor.get(j).getCodigoProfessor() == codigoProfTitular) {
                        if (listProfessor.get(j) instanceof ProfTitular) {
                            listCurso.get(i).setProfTitular(listProfessor.get(j));
                            for(int k = 0; k<listProfessor.size();k++){
                                if(listProfessor.get(k).getCodigoProfessor() == codigoProfAdjunto){
                                    listCurso.get(i).setProfAdjunto(listProfessor.get(k));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

