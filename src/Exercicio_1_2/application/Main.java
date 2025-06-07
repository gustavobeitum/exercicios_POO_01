package Exercicio_1_2.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_1_2.core.Palindromo;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma palavra para saber se é palíndromo ou não.");
        String phase = sc.nextLine();

        Palindromo word = new Palindromo(phase);

        if(word.isPalindromo()){
            System.out.print("A palvara " + word.getWord() + " é um palíndromo");
        } else {
            System.out.print("A palvara " + word.getWord() + " não é um palíndromo");
        }


        sc.close();
    }
}
