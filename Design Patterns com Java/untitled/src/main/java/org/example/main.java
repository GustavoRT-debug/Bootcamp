package org.example;

import br.com.pedidos.model.*;
import br.com.pedidos.model.transportadoras.TransportadoraFactory;
import br.com.pedidos.service.LojaService;

public class Main {
    public static void main(String[] args) {
        LojaService loja = LojaService.getInstance(); // Singleton

        cliente cliente = new Cliente("Gustavo Torres", "gustavo@email.com");
        Pedido pedido = new Pedido(cliente, 250.0);

        loja.registrarObservadores();
        loja.processarPedido(pedido, "correios", "expresso");
    }
}

