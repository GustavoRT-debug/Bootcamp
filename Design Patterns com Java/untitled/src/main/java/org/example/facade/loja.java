package org.example.facade;

import org.example.one.service.LojaService;
import org.example.pedido.Pedido;

public class LojaFacade {
    private final LojaService lojaService = LojaService.getInstance();

    public void registrarObservadores() {
        lojaService.registrarObservadores();
    }

    public void realizarPedido(Pedido pedido, String tipoTransportadora, String tipoFrete) {
        lojaService.processarPedido(pedido, tipoTransportadora, tipoFrete);
    }
}
