package org.example;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public void ContaCorrente(){
        super.agencia=Conta.AGENCIA_PADRAO;
        super.numero=SEQUENCIAL++;


    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta corrente");
    }
}
