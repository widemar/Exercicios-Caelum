package Exercicios_4_12;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Data data = new Data();

        c1.nomeTitular = "Widemar";
        c1.saldo = 2500.00;
        c1.agencia = "125-01";
        c1.numeroDaConta = 193;
        data.dia = 01;
        data.mes = 01;
        data.ano = 1990;
        c1.dataDeAbertura = data;


        c1.deposita(500);
        c1.saca(1000);

        c2.nomeTitular = "Widemar";
        c2.saldo = 2500.00;
        c2.agencia = "125-01";
        c2.numeroDaConta = 193;
        c2.dataDeAbertura = data;

        c2.deposita(500);
        c2.saca(1000);


        System.out.println(c1.recuperaDadosParaImpressao());
        System.out.println(c2.recuperaDadosParaImpressao());

        c1 = c2;

        if (c1 == c2) {
            System.out.println("São iguais");
        } else {
            System.out.println("São Diferentes");
        }

    }
}
