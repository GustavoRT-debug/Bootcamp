package org.example.observer;
package br.com.pedidos.observer;
import br.com.pedidos.model.Pedido;

    public class sistema implements PedidoObserver {
        @Override
        public void atualizar(Pedido pedido) {
            System.out.println("[API Parceira] Pedido " + pedido.getId() + " integrado com sucesso!");
        }
    }


