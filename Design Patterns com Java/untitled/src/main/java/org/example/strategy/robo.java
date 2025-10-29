package org.example.strategy;

public class robo {
    private comportamento strategy;
    public void robo(comportamento strategy) {
        this.strategy = strategy;
    }
    public void mover() {
        comportamento.mover();
    }


    public void setcomportamento(compNormal normal) {
    }

    public void setcompdefensivo(compdefensivo defensivo) {
    }
}
