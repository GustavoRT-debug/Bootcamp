package src;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num;
        int count=0;
        int maior=0;
        int soma=0;
       
        do{
            System.out.println("Numero: ");
            num=scanner.nextInt();
            soma=soma+num;
            if(num>maior) maior=num;
            count=count+1;

        }while(count<5);

        System.out.println("Maior: "+maior);
        System.out.println("Maior: "+soma/5);
    }
    
}
