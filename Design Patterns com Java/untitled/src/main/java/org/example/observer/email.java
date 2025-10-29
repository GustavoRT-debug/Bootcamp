package org.example.observer.email;

import org.example.observer.pedido.PedidoObserver;
import org.example.pedido.Pedido;

public class EmailNotificacao implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("[Email] Enviado para: " + pedido.getCliente().getEmail());
    }
}
