package src;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota=scanner.nextInt();

        while(nota<0|nota>10){
            System.out.println("Invalida: ");
            nota=scanner.nextInt();
        }


    }
}
