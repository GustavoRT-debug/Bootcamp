package org.example.one;

import org.example.strategy.compNormal;
import org.example.strategy.compdefensivo;
import org.example.strategy.comportamento;
import org.example.strategy.robo;

public class Test {
    public static void main(String[] args) {
        sinngletonEager eager=sinngletonEager.getInstance();
        System.out.println(eager);
        eager=sinngletonEager.getInstance();
        System.out.println(eager);

        compNormal normal=new compNormal();
        compdefensivo defensivo=new compdefensivo();

        robo robo=new robo();
        robo.setcomportamento(normal);
        robo.setcompdefensivo(defensivo);

    }
}
