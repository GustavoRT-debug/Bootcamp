package one.digital;

import java.util.*;

public class main{
    public static void main(String[] args){
        Queue<carro> queueCarros = new LinkedList<>();

        queueCarros.add(new carro("Ford"));
        queueCarros.add(new carro("Nissan"));

        System.out.println(queueCarros.add(new carro("VW")));
        System.out.println(queueCarros.offer(new carro("Nissan")));
        System.out.println(queueCarros.peek());
    }
}
