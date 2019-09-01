package Exercicios_3_13;

public class Ex_02 {
    public static void main(String[] args) {
        int contador = 1, soma = 0;

        while (contador <= 1000) {
            soma = soma + contador;
            System.out.println(soma);
            contador++;
        }
    }
}
