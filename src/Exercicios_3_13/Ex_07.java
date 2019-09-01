package Exercicios_3_13;

public class Ex_07 {
    public static void main(String[] args) {
        int x = 13;
        do {
            if (x % 2 == 0) {
                x = x / 2;
            } else if (x % 2 != 0) {
                x = (3 * x) + 1;
            }
            System.out.print(x+",");
        } while (x != 1);
    }
}
