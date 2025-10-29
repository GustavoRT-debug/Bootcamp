package org.example.observer;
package pedidos.observer;
import pedidos.model.Pedido;

    public class email implements PedidoObserver {
        @Override
        public void atualizar(Pedido pedido) {
            System.out.println("[Email] Notificação enviada para " + pedido.getCliente().getEmail());
        }
    }

