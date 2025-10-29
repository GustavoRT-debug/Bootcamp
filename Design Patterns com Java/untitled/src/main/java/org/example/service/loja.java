package org.example.service;
package pedidos.service;
import pedido;
import transportadoras.transportadora;
import transportadoras.TransportadoraFactory;
import observer.*;
import pedidos.strategy.*;

public class LojaService {

    private static LojaService instancia; // Singleton
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
        FreteStrategy freteStrategy = tipoFrete.equalsIgnoreCase("expresso") ?
                new FreteExpresso() : new FreteEconomico();

        double valorFrete = freteStrategy.calcular(pedido.getValor());
        pedido.setFrete(valorFrete);
        pedido.setTransportadora(transportadora);

        System.out.println("\nPedido processado:");
        System.out.println(pedido);
        notificador.notificar(pedido);
    }
}
