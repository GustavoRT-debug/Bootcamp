package org.example;

import org.example.cliente.Cliente;
import org.example.pedido.Pedido;
import org.example.facade.LojaFacade;

public class Main {
    public static void main(String[] args) {
        LojaFacade loja = new LojaFacade();

        Cliente cliente = new Cliente("Gustavo Torres", "gustavo@email.com");
        Pedido pedido = new Pedido(cliente, 250.0);

        loja.registrarObservadores();
        loja.realizarPedido(pedido, "correios", "expresso");
    }
}
