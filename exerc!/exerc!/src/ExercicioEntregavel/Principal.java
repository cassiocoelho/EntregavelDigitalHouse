package ExercicioEntregavel;

        import ExercicioEntregavel.Curso;
        import ExercicioEntregavel.DigitalHouseManager;
        import ExercicioEntregavel.ProfAdjunto;
        import ExercicioEntregavel.ProfTitular;

        import java.util.ArrayList;
        import java.util.Calendar;
        import java.util.Date;

public class Principal {

    public static void main( String[] args ) {

        DigitalHouseManager dh = new DigitalHouseManager();

        dh.registrarAluno("Cassio", "Coelho", 123);
        dh.registrarAluno("Alexsandro", "Pipoca", 124);
        dh.registrarAluno("Milho", "Arroz", 125);
        dh.registrarAluno("Godofredo", "Soares", 126);
        dh.registrarAluno("Vicenitno", "Mala", 127);
        dh.registrarCurso("Android", 20002, 2);
        dh.registrarCurso("Full Stack", 20001, 3);
        dh.matricularAluno(123, 20002);
        dh.matricularAluno(124, 20002);
        dh.matricularAluno(125, 20001);
        dh.matricularAluno(126, 20001);
        dh.matricularAluno(127, 20001);
        dh.registrarProfTitular("Romário", "Pereira", 2, 345, "Programador");
        dh.registrarProfessorAdjunto("Marcos", "Gente Boa", 12, 245, 40);
        dh.registrarProfTitular("Victor", "Flamengo", 2, 145, "Engenheiro");
        dh.registrarProfessorAdjunto("Leandro", "Medeiros", 1, 230, 40);
        dh.alocarProfessores(20002, 345, 245);
        dh.alocarProfessores(20001, 145, 230);
    }
}