package Exercicios_3_13;

public class Ex_08 {
    public static void main(String[] args) {
        for(int contador=0; contador<1; contador++){
            System.out.println(1);
            for(int contador1=2; contador1<4; contador1+=2){
                System.out.print(contador1+" \n");
                    for (int contador2=3; contador2<=9; contador2+=3){
                    System.out.print(contador2+" ");
                }
            }
        }
    }
}
