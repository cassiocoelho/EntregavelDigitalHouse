package showDoMilhao;

import java.util.Scanner;

public class ShowDoMilhao {

    public static void main(String[] args) {

        // Variavel para verificar
        boolean estaNoJogo = true;

        Jogo cassio = new Jogo();


        cassio.bemVindo();

        cassio.jogandoShowDoMilhao(true);
    }
}

