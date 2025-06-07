package Exercicio_1_3.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_1_3.core.Fatorial;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para obter seu fatorial: ");
        int numberDigit = sc.nextInt();

        Fatorial number = new Fatorial(numberDigit);

        int result = number.fatorial(numberDigit);

        if (result == 0) {
            System.out.println("Não tem fatorial, valor é negativo");
        }else{
            System.out.println("O valor de fatorial de " + number.getNumber() + " é de " + result);
        }

        sc.close(); 
    }
}
