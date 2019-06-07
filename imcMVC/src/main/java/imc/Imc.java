package imc;

public class Imc {

    public static double calcularIMC (double altura, double peso) {
        double imc = peso / (altura * altura);
        return imc;
    }

    public static String analiseResultado (double imc) {
        String analise;
        if (imc < 18.5) {
            analise = "Voce esta abaixo do peso";
        } else if (imc <= 24.9) {
            analise = "Voce esta no peso normal";
        } else if (imc <= 29.9) {
            analise = "Voce esta acima do peso";
        } else if (imc <= 34.9) {
            analise = "Voce esta com obesidade grau 1";
        } else if (imc <= 39.9) {
            analise = "Voce esta com obesidade grau 2";
        } else {
            analise = "Voce esta com obesidade grau 3";
        }
    return analise;
    }
}
