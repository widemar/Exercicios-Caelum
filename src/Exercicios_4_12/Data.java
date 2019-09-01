package Exercicios_4_12;

public class Data {
    int dia;
    int mes;
    int ano;

    String formatada() {
        String dados = this.dia + "/" + this.mes + "/" + this.ano;
        return dados;
    }
}
