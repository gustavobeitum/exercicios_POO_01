package Exercicio_2_1.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_1.core.Matriz;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas sua matriz terá? Por valor digite um número inteiro.");
        int m = sc.nextInt();

        System.out.println("Quantas colunas sua matriz terá? Por valor digite um número inteiro.");
        int n = sc.nextInt();

        Matriz number = new Matriz(m, n);

        number.setMatriz(m, n);

        number.findNumbers(m, n);

        sc.close();
    }
}
