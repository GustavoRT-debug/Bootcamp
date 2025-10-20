package one.digital;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class main{
    public static void main(String[] args){
        List<carro> carros = new ArrayList<>();
        carros.add(new carro("Ford"));
        carros.add(new carro("Toyota"));
        carros.add(new carro("Fiat"));

        System.out.println(carros.contains(new carro("Fiat")));
        System.out.println(carros.get(2));
        System.out.println(carros.remove(new carro("Fiat")));
    }
}
