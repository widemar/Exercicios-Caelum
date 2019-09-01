package Exercicios_4_12;

public class Conta {
    String nomeTitular;
    int numeroDaConta;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    void saca(double valor) {
        this.saldo = (this.saldo - valor);
    }

    void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }

    String recuperaDadosParaImpressao() {
        String dados = "\nTitular: " + this.nomeTitular;
        dados += "\nNumero: " + this.numeroDaConta;
        dados += "\nDia: " + this.dataDeAbertura.formatada();
        dados += "\nSaldo: " + this.saldo;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nRendimento: " + calculaRendimento();
        return dados;
    }
}
