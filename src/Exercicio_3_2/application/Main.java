package Exercicio_3_2.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_3_2.core.ValorConteiner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número A: ");
        int valueA = sc.nextInt();
        ValorConteiner objA = new ValorConteiner(valueA);

        System.out.print("Digite um número B: ");
        int valueB = sc.nextInt();
        ValorConteiner objB = new ValorConteiner(valueB);
        
        System.out.println("");

        System.out.println("Valor do objeto A: " + objA.getNumber());
        System.out.println("Valor do objeto B: " + objB.getNumber());
        
        trocarValores(objA, objB);
        System.out.println("");
        System.out.println("Valor do objeto A: " + objA.getNumber());
        System.out.println("Valor do objeto B: " + objB.getNumber());

        sc.close();
    }
    
    public static void trocarValores(ValorConteiner objA, ValorConteiner objB) {
           int aux = objA.number;
           objA.number = objB.number;
           objB.number = aux;
       }
}
