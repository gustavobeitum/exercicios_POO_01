package Exercicio_2_2.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_2_2.core.Matriz;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas e colunas sua matriz quadrada terá? Por valor digite um número inteiro.");
        int n = sc.nextInt();

        Matriz matriz = new Matriz(n);

        matriz.setMatriz(n);

        matriz.sumDiagonal(n);

        sc.close();
    }
}
