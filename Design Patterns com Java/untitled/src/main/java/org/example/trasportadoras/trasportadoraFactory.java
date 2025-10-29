package org.example.trasportadoras;
package br.com.pedidos.model.transportadoras;

public class trasportadoraFactory {

        public static Transportadora criarTransportadora(String tipo) {
            switch (tipo.toLowerCase()) {
                case "correios": return new Correios();
                case "jadlog": return new JadLog();
                default: throw new IllegalArgumentException("Transportadora desconhecida: " + tipo);
            }
        }
    }

}
