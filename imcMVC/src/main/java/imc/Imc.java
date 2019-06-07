package imc;

public class Imc {

    public static double calcularIMC (double altura, double peso) {
        double imc = peso / (altura * altura);
        return imc;
    }

}
