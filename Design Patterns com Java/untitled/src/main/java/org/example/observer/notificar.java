package org.example.observer.notificador;

import org.example.pedido.Pedido;
import org.example.observer.pedido.PedidoObserver;
import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private final List<PedidoObserver> observadores = new ArrayList<>();

    public void adicionar(PedidoObserver obs) {
        observadores.add(obs);
    }

    public void notificar(Pedido pedido) {
        observadores.forEach(o -> o.atualizar(pedido));
    }
}
