package Calculadora;

public class Principal {
    public static void main(String[] args) {
        String nome = "cassio";
        Calcular modelo = new Calcular();
        Calcular cientifico = new Calcular();
    System.out.println("Metodo com inteiros: " + modelo.calculo(50,90));
    System.out.println("Metodo com double: " + modelo.calculo(20, 40, 60));
    System.out.println("Metodos com FLOAT: " + modelo.calculo(10, 40));
    // System.out.println(modelo.equals(cientifico));

    }
}
