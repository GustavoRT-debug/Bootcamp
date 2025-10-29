package org.example.one.service;

import org.example.observer.email.EmailNotificacao;
import org.example.observer.notificador.Notificador;
import org.example.observer.sistema.SistemaParceiro;
import org.example.pedido.Pedido;
import org.example.strategy.comportamento.*;
import org.example.trans.Transportadora;
import org.example.transportadoras.transportadoraFactory.TransportadoraFactory;

public class LojaService {

    private static LojaService instancia;
    private final Notificador notificador = new Notificador();

    private LojaService() {}

    public static LojaService getInstance() {
        if (instancia == null) {
            instancia = new LojaService();
        }
        return instancia;
    }

    public void registrarObservadores() {
        notificador.adicionar(new EmailNotificacao());
        notificador.adicionar(new SistemaParceiro());
    }

    public void processarPedido(Pedido pedido, String tipoTransportadora, String tipoFrete) {
        Transportadora transportadora = TransportadoraFactory.criarTransportadora(tipoTransportadora);
        FreteStrategy strategy = tipoFrete.equalsIgnoreCase("expresso") ?
                new FreteExpresso() : new FreteEconomico();

        double valorFrete = strategy.calcular(pedido.getValor());
        pedido.setFrete(valorFrete);
        pedido.setTransportadora(transportadora);

        System.out.println("Pedido processado: " + pedido);
        notificador.notificar(pedido);
    }
}
