package org.example.observer;
package br.com.pedidos.observer;
import br.com.pedidos.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class notificador {
        private final List<PedidoObserver> observadores = new ArrayList<>();

        public void adicionar(PedidoObserver obs) {
            observadores.add(obs);
        }

        public void notificar(Pedido pedido) {
            observadores.forEach(o -> o.atualizar(pedido));
        }
    }


