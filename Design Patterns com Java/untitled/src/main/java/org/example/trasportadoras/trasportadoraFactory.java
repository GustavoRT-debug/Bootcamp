package org.example.transportadoras.transportadoraFactory;

import org.example.trans.Transportadora;
import org.example.transportadoras.correios.Correios;
import org.example.transportadoras.jadLog.JadLog;

public class TransportadoraFactory {
    public static Transportadora criarTransportadora(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "correios" -> new Correios();
            case "jadlog" -> new JadLog();
            default -> throw new IllegalArgumentException("Transportadora desconhecida: " + tipo);
        };
    }
}
