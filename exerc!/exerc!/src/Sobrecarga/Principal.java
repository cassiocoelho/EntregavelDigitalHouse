package Sobrecarga;

public class Principal {
    public static void main(String[] args) {
        Matematica professor = new Matematica();
        System.out.println("Metodo com inteiros: " + professor.quadrado(1342));
        System.out.println("Metodo com double: " + professor.quadrado(Math.PI));
        }
    }
