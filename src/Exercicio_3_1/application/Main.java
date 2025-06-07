package Exercicio_3_1.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_3_1.core.Numero;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Numero number = new Numero(3);

         System.out.println("Valor: " + number.getNumber());

        System.out.println("Valor simulado usando hash: " + System.identityHashCode(number));

        sc.close();
    }
}
