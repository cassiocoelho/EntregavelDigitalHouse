package Calculadora;

public class Calcular {

    public int calculo(int number1, int number2){
        int calculo;
        calculo = number1 * number2;
        return calculo;
    }

    public double calculo(double number1, double number2){
        double calculo;
        calculo = number1 / number2;
        return calculo;
    }

    public float calculo(float number1, float number2){
        float calculo;
        calculo = number1 - number2;
        return  calculo;
    }

    public int calculo(int number1, int number2, int numero3){
        int calculo;
        calculo = number1 + number2 + numero3;
        return calculo;
    }


}
