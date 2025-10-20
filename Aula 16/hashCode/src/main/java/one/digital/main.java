package one.digital;

import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args){
        List<carro> ListCarros = new ArrayList<carro>();
        ListCarros.add(new carro("Ford"));
        ListCarros.add(new carro("Nissan"));

        System.out.println(ListCarros.contains(new carro("Ford")));
    }
}
