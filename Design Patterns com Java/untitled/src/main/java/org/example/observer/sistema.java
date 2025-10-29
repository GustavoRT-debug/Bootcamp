package org.example.observer.sistema;

import org.example.observer.pedido.PedidoObserver;
import org.example.pedido.Pedido;

public class SistemaParceiro implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("[Sistema Parceiro] Pedido " + pedido.getId() + " sincronizado!");
    }
}
