package org.example.transportadoras.correios;

import org.example.trans.Transportadora;

public class Correios implements Transportadora {
    @Override
    public String getNome() {
        return "Correios";
    }
}
