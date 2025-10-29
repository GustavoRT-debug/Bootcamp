package org.example.pedido;

import org.example.cliente.Cliente;
import org.example.trans.Transportadora;
import java.util.UUID;

public class Pedido {
    private final String id = UUID.randomUUID().toString();
    private final Cliente cliente;
    private final double valor;
    private double frete;
    private Transportadora transportadora;

    public Pedido(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public String getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public double getValor() { return valor; }
    public void setFrete(double frete) { this.frete = frete; }
    public void setTransportadora(Transportadora t) { this.transportadora = t; }

    @Override
    public String toString() {
        return "Pedido{id=" + id +
                ", cliente=" + cliente.getNome() +
                ", valor=R$" + valor +
                ", frete=R$" + frete +
                ", transportadora=" + transportadora.getNome() + '}';
    }
}
