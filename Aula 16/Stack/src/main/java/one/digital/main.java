package one.digital;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class main{
    public static void main(String[] args){
        Stack<carro> stackCarros = new Stack<>();

        stackCarros.push(new carro("Ford"));
        stackCarros.push(new carro("Nissan"));

        System.out.println(stackCarros);
    }
}
