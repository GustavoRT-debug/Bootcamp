package org.example.observer.pedido;

import org.example.pedido.Pedido;

public interface PedidoObserver {
    void atualizar(Pedido pedido);
}
