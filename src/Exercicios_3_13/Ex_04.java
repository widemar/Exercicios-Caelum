package Exercicios_3_13;

public class Ex_04 {
    public static void main(String[] args) {
        long fatorial = 20;
        long f=fatorial;

        while (fatorial>1){
            f=f*(fatorial-1);

            fatorial--;

        }
        System.out.println(f);

    }
}

